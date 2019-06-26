
console.log('gnjfngjf')
console.log($('#b').attr('stroke'))

$(document).ready(function(){
    var arr =['red','blue','green'];
    i=0;
    setInterval(function(){  
      if(i==3)
        i=0;
      $('#b').attr('stroke',arr[i]);
      ++i;
    },1000);
    
});