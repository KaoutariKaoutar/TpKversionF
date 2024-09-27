package dataStore;

import jakarta.persistence.SharedCacheMode;
import jakarta.persistence.ValidationMode;
import jakarta.persistence.spi.ClassTransformer;
import jakarta.persistence.spi.PersistenceUnitInfo;
import jakarta.persistence.spi.PersistenceUnitTransactionType;

import javax.sql.DataSource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Bibliotheque_PersistenceUnitInfo implements PersistenceUnitInfo {

    @Override
    public String getPersistenceUnitName() {
        return "Bibliotheque_PersistenceUnitInfo";
    }

    @Override
    public String getPersistenceProviderClassName() {
        return "org.hibernate.jpa.HibernatePersistenceProvider";
    }

    @Override
    public PersistenceUnitTransactionType getTransactionType() {
        return PersistenceUnitTransactionType.RESOURCE_LOCAL;
    }

    @Override
    public DataSource getJtaDataSource() {
        return null;
    }

    @Override
    public DataSource getNonJtaDataSource() {
        return null;
    }

    @Override
    public List<String> getMappingFileNames() {
        return List.of();
    }

    @Override
    public List<URL> getJarFileUrls() {
        return List.of();
    }

    @Override
    public URL getPersistenceUnitRootUrl() {
        return null;
    }

    @Override
    public List<String> getManagedClassNames() {
        List<String> managedClassNames = new ArrayList<>();
        managedClassNames.add("modele.Bibliotheque");
        managedClassNames.add("modele.Employe");
        managedClassNames.add("modele.Livre");
        managedClassNames.add("modele.Emprunt");
        managedClassNames.add("modele.Abonne");
        return managedClassNames;
    }

    @Override
    public boolean excludeUnlistedClasses() {
        return false;
    }

    @Override
    public SharedCacheMode getSharedCacheMode() {
        return null;
    }

    @Override
    public ValidationMode getValidationMode() {
        return null;
    }

    @Override
    public Properties getProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.format_sql","false");
        properties.setProperty("hibernate.use_sql_comments","false");
        properties.setProperty("hibernate.show_sql","true");
        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MariaDBDialect");
        properties.setProperty("hibernate.ejb.interceptor","org.hibernate.ejb.interceptor.EmptyInterceptor");

        properties.setProperty("javax.persistence.jdbc.driver","org.mariadb.jdbc.Driver");
        properties.setProperty("javax.persistence.jdbc.url","jdbc:mariadb://mysql-kaoutar-kaoutari.alwaysdata.net:3306/kaoutar-kaoutari_tp_web");
        properties.setProperty("javax.persistence.jdbc.user","366912_user");
        properties.setProperty("javax.persistence.jdbc.password","Joud1234");

        return properties;
    }

    @Override
    public String getPersistenceXMLSchemaVersion() {
        return "";
    }

    @Override
    public ClassLoader getClassLoader() {
        return null;
    }

    @Override
    public void addTransformer(ClassTransformer classTransformer) {

    }

    @Override
    public ClassLoader getNewTempClassLoader() {
        return null;
    }
}
