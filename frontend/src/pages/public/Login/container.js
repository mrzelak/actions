import React, { useEffect } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
import useUnauthorizedHandler from 'hooks/useUnauthorizedHandler';
import UserManager from 'managers/UserManager';
import LoginView from './view';

const LoginContainer = () => {
  const navigate = useNavigate();
  const { handleUnauthorized } = useUnauthorizedHandler();

  useEffect(() => {
    if (UserManager.isLoggedIn()) {
      navigate('/application/tasks/list');
    }
  }, []);

  const onSubmit = async (values) => {
    try {
      const res = await axios.post(
        `${process.env.REACT_APP_API_URL}/authentication/signin`,
        values
      );
      const bearerToken = `${res.data.type} ${res.data.token}`;
      UserManager.setToken(bearerToken);
      UserManager.setUsername(res.data.username);
      navigate('/application/tasks/list');
    } catch (err) {
      handleUnauthorized(err);
    }
  };

  return <LoginView onSubmit={onSubmit} />;
};

export default LoginContainer;
