// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.WebTestGeolocationResponse;
import io.pulumi.azurenative.insights.outputs.WebTestPropertiesResponseConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebTestResult {
    private final @Nullable WebTestPropertiesResponseConfiguration configuration;
    private final @Nullable String description;
    private final @Nullable Boolean enabled;
    private final @Nullable Integer frequency;
    private final String id;
    private final @Nullable String kind;
    private final String location;
    private final List<WebTestGeolocationResponse> locations;
    private final String name;
    private final String provisioningState;
    private final @Nullable Boolean retryEnabled;
    private final String syntheticMonitorId;
    private final @Nullable Map<String,String> tags;
    private final @Nullable Integer timeout;
    private final String type;
    private final String webTestKind;
    private final String webTestName;

    @OutputCustomType.Constructor({"configuration","description","enabled","frequency","id","kind","location","locations","name","provisioningState","retryEnabled","syntheticMonitorId","tags","timeout","type","webTestKind","webTestName"})
    private GetWebTestResult(
        @Nullable WebTestPropertiesResponseConfiguration configuration,
        @Nullable String description,
        @Nullable Boolean enabled,
        @Nullable Integer frequency,
        String id,
        @Nullable String kind,
        String location,
        List<WebTestGeolocationResponse> locations,
        String name,
        String provisioningState,
        @Nullable Boolean retryEnabled,
        String syntheticMonitorId,
        @Nullable Map<String,String> tags,
        @Nullable Integer timeout,
        String type,
        String webTestKind,
        String webTestName) {
        this.configuration = configuration;
        this.description = description;
        this.enabled = enabled;
        this.frequency = frequency;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.location = Objects.requireNonNull(location);
        this.locations = Objects.requireNonNull(locations);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.retryEnabled = retryEnabled;
        this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId);
        this.tags = tags;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type);
        this.webTestKind = Objects.requireNonNull(webTestKind);
        this.webTestName = Objects.requireNonNull(webTestName);
    }

    public Optional<WebTestPropertiesResponseConfiguration> getConfiguration() {
        return Optional.ofNullable(this.configuration);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Integer> getFrequency() {
        return Optional.ofNullable(this.frequency);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public String getLocation() {
        return this.location;
    }
    public List<WebTestGeolocationResponse> getLocations() {
        return this.locations;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<Boolean> getRetryEnabled() {
        return Optional.ofNullable(this.retryEnabled);
    }
    public String getSyntheticMonitorId() {
        return this.syntheticMonitorId;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    public String getType() {
        return this.type;
    }
    public String getWebTestKind() {
        return this.webTestKind;
    }
    public String getWebTestName() {
        return this.webTestName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebTestResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebTestPropertiesResponseConfiguration configuration;
        private @Nullable String description;
        private @Nullable Boolean enabled;
        private @Nullable Integer frequency;
        private String id;
        private @Nullable String kind;
        private String location;
        private List<WebTestGeolocationResponse> locations;
        private String name;
        private String provisioningState;
        private @Nullable Boolean retryEnabled;
        private String syntheticMonitorId;
        private @Nullable Map<String,String> tags;
        private @Nullable Integer timeout;
        private String type;
        private String webTestKind;
        private String webTestName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebTestResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.frequency = defaults.frequency;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retryEnabled = defaults.retryEnabled;
    	      this.syntheticMonitorId = defaults.syntheticMonitorId;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.webTestKind = defaults.webTestKind;
    	      this.webTestName = defaults.webTestName;
        }

        public Builder setConfiguration(@Nullable WebTestPropertiesResponseConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setFrequency(@Nullable Integer frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocations(List<WebTestGeolocationResponse> locations) {
            this.locations = Objects.requireNonNull(locations);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRetryEnabled(@Nullable Boolean retryEnabled) {
            this.retryEnabled = retryEnabled;
            return this;
        }

        public Builder setSyntheticMonitorId(String syntheticMonitorId) {
            this.syntheticMonitorId = Objects.requireNonNull(syntheticMonitorId);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWebTestKind(String webTestKind) {
            this.webTestKind = Objects.requireNonNull(webTestKind);
            return this;
        }

        public Builder setWebTestName(String webTestName) {
            this.webTestName = Objects.requireNonNull(webTestName);
            return this;
        }

        public GetWebTestResult build() {
            return new GetWebTestResult(configuration, description, enabled, frequency, id, kind, location, locations, name, provisioningState, retryEnabled, syntheticMonitorId, tags, timeout, type, webTestKind, webTestName);
        }
    }
}