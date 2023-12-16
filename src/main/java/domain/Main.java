package domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.CityDAO;
import dao.CountryDAO;
import org.hibernate.SessionFactory;

public class Main {
    private final SessionFactory sessionFactory;
    //private final RedisClient redisClient;
    private final ObjectMapper mapper;

    private final CityDAO cityDAO;
    private final CountryDAO countryDAO;

    public Main() {
        //sessionFactory = prepareRelationalDb();
        cityDAO = new CityDAO(sessionFactory);
        countryDAO = new CountryDAO(sessionFactory);

        //redisClient = prepareRedisClient();
        mapper = new ObjectMapper();
    }
}
