import * as React from 'react';
import {NativeModules, Button} from 'react-native';

const {AndroidToast} = NativeModules;

const waitResult = async () => {
  const result = await AndroidToast.toast('jump');
  console.log('result ' + result);
};

const HomeScreen = ({navigation}) => {
  return (
    <Button
      title="Go to Jane's profile"
      onPress={() => {
        navigation.navigate('Profile', {name: 'Jane'});
        waitResult();
      }}
    />
  );
};
export default HomeScreen;
