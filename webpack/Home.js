import * as React from 'react';
import {NativeModules, Button} from 'react-native';

const {AndroidToast} = NativeModules;

const HomeScreen = ({navigation}) => {
  return (
    <Button
      title="Go to Jane's profile"
      onPress={() => {
        navigation.navigate('Profile', {name: 'Jane'});
        AndroidToast.toast('jump');
      }}
    />
  );
};
export default HomeScreen;
