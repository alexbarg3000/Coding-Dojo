select u.first_name, u.last_name, u2.first_name as friend_first_name, u2.last_name as friend_last_name 
from users u
left join friendships fr on u.id = fr.user_id
left join users u2 on fr.friend_id = u2.id
order by u.first_name

