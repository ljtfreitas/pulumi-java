// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppConfigResult {
    private final String apiKey;
    private final String authDomain;
    private final String databaseUrl;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String locationId;
    private final String measurementId;
    private final String messagingSenderId;
    private final @Nullable String project;
    private final String storageBucket;
    private final String webAppId;

    @OutputCustomType.Constructor({"apiKey","authDomain","databaseUrl","id","locationId","measurementId","messagingSenderId","project","storageBucket","webAppId"})
    private GetWebAppConfigResult(
        String apiKey,
        String authDomain,
        String databaseUrl,
        String id,
        String locationId,
        String measurementId,
        String messagingSenderId,
        @Nullable String project,
        String storageBucket,
        String webAppId) {
        this.apiKey = Objects.requireNonNull(apiKey);
        this.authDomain = Objects.requireNonNull(authDomain);
        this.databaseUrl = Objects.requireNonNull(databaseUrl);
        this.id = Objects.requireNonNull(id);
        this.locationId = Objects.requireNonNull(locationId);
        this.measurementId = Objects.requireNonNull(measurementId);
        this.messagingSenderId = Objects.requireNonNull(messagingSenderId);
        this.project = project;
        this.storageBucket = Objects.requireNonNull(storageBucket);
        this.webAppId = Objects.requireNonNull(webAppId);
    }

    public String getApiKey() {
        return this.apiKey;
    }
    public String getAuthDomain() {
        return this.authDomain;
    }
    public String getDatabaseUrl() {
        return this.databaseUrl;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getLocationId() {
        return this.locationId;
    }
    public String getMeasurementId() {
        return this.measurementId;
    }
    public String getMessagingSenderId() {
        return this.messagingSenderId;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getStorageBucket() {
        return this.storageBucket;
    }
    public String getWebAppId() {
        return this.webAppId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;
        private String authDomain;
        private String databaseUrl;
        private String id;
        private String locationId;
        private String measurementId;
        private String messagingSenderId;
        private @Nullable String project;
        private String storageBucket;
        private String webAppId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.authDomain = defaults.authDomain;
    	      this.databaseUrl = defaults.databaseUrl;
    	      this.id = defaults.id;
    	      this.locationId = defaults.locationId;
    	      this.measurementId = defaults.measurementId;
    	      this.messagingSenderId = defaults.messagingSenderId;
    	      this.project = defaults.project;
    	      this.storageBucket = defaults.storageBucket;
    	      this.webAppId = defaults.webAppId;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }

        public Builder setAuthDomain(String authDomain) {
            this.authDomain = Objects.requireNonNull(authDomain);
            return this;
        }

        public Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = Objects.requireNonNull(databaseUrl);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = Objects.requireNonNull(locationId);
            return this;
        }

        public Builder setMeasurementId(String measurementId) {
            this.measurementId = Objects.requireNonNull(measurementId);
            return this;
        }

        public Builder setMessagingSenderId(String messagingSenderId) {
            this.messagingSenderId = Objects.requireNonNull(messagingSenderId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setStorageBucket(String storageBucket) {
            this.storageBucket = Objects.requireNonNull(storageBucket);
            return this;
        }

        public Builder setWebAppId(String webAppId) {
            this.webAppId = Objects.requireNonNull(webAppId);
            return this;
        }
        public GetWebAppConfigResult build() {
            return new GetWebAppConfigResult(apiKey, authDomain, databaseUrl, id, locationId, measurementId, messagingSenderId, project, storageBucket, webAppId);
        }
    }
}
