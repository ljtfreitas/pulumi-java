// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.inputs;

import io.pulumi.azurenative.elastic.inputs.ElasticPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to the monitor resource.
 * 
 */
public final class MonitorPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonitorPropertiesResponse Empty = new MonitorPropertiesResponse();

    /**
     * Elastic cloud properties.
     * 
     */
    @InputImport(name="elasticProperties")
        private final @Nullable ElasticPropertiesResponse elasticProperties;

    public Optional<ElasticPropertiesResponse> getElasticProperties() {
        return this.elasticProperties == null ? Optional.empty() : Optional.ofNullable(this.elasticProperties);
    }

    @InputImport(name="liftrResourceCategory", required=true)
        private final String liftrResourceCategory;

    public String getLiftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * The priority of the resource.
     * 
     */
    @InputImport(name="liftrResourcePreference", required=true)
        private final Integer liftrResourcePreference;

    public Integer getLiftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @InputImport(name="monitoringStatus")
        private final @Nullable String monitoringStatus;

    public Optional<String> getMonitoringStatus() {
        return this.monitoringStatus == null ? Optional.empty() : Optional.ofNullable(this.monitoringStatus);
    }

    /**
     * Provisioning state of the monitor resource.
     * 
     */
    @InputImport(name="provisioningState")
        private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    public MonitorPropertiesResponse(
        @Nullable ElasticPropertiesResponse elasticProperties,
        String liftrResourceCategory,
        Integer liftrResourcePreference,
        @Nullable String monitoringStatus,
        @Nullable String provisioningState) {
        this.elasticProperties = elasticProperties;
        this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory, "expected parameter 'liftrResourceCategory' to be non-null");
        this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference, "expected parameter 'liftrResourcePreference' to be non-null");
        this.monitoringStatus = monitoringStatus;
        this.provisioningState = provisioningState;
    }

    private MonitorPropertiesResponse() {
        this.elasticProperties = null;
        this.liftrResourceCategory = null;
        this.liftrResourcePreference = null;
        this.monitoringStatus = null;
        this.provisioningState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ElasticPropertiesResponse elasticProperties;
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private @Nullable String monitoringStatus;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elasticProperties = defaults.elasticProperties;
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setElasticProperties(@Nullable ElasticPropertiesResponse elasticProperties) {
            this.elasticProperties = elasticProperties;
            return this;
        }

        public Builder setLiftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }

        public Builder setLiftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }

        public Builder setMonitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public MonitorPropertiesResponse build() {
            return new MonitorPropertiesResponse(elasticProperties, liftrResourceCategory, liftrResourcePreference, monitoringStatus, provisioningState);
        }
    }
}
