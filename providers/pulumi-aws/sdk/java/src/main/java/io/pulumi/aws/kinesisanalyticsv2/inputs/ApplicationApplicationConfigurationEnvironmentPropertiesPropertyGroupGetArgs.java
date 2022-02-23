// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs Empty = new ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs();

    /**
     * The key of the application execution property key-value map.
     * 
     */
    @InputImport(name="propertyGroupId", required=true)
    private final Input<String> propertyGroupId;

    public Input<String> getPropertyGroupId() {
        return this.propertyGroupId;
    }

    /**
     * Application execution property key-value map.
     * 
     */
    @InputImport(name="propertyMap", required=true)
    private final Input<Map<String,String>> propertyMap;

    public Input<Map<String,String>> getPropertyMap() {
        return this.propertyMap;
    }

    public ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs(
        Input<String> propertyGroupId,
        Input<Map<String,String>> propertyMap) {
        this.propertyGroupId = Objects.requireNonNull(propertyGroupId, "expected parameter 'propertyGroupId' to be non-null");
        this.propertyMap = Objects.requireNonNull(propertyMap, "expected parameter 'propertyMap' to be non-null");
    }

    private ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs() {
        this.propertyGroupId = Input.empty();
        this.propertyMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> propertyGroupId;
        private Input<Map<String,String>> propertyMap;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propertyGroupId = defaults.propertyGroupId;
    	      this.propertyMap = defaults.propertyMap;
        }

        public Builder setPropertyGroupId(Input<String> propertyGroupId) {
            this.propertyGroupId = Objects.requireNonNull(propertyGroupId);
            return this;
        }

        public Builder setPropertyGroupId(String propertyGroupId) {
            this.propertyGroupId = Input.of(Objects.requireNonNull(propertyGroupId));
            return this;
        }

        public Builder setPropertyMap(Input<Map<String,String>> propertyMap) {
            this.propertyMap = Objects.requireNonNull(propertyMap);
            return this;
        }

        public Builder setPropertyMap(Map<String,String> propertyMap) {
            this.propertyMap = Input.of(Objects.requireNonNull(propertyMap));
            return this;
        }
        public ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs build() {
            return new ApplicationApplicationConfigurationEnvironmentPropertiesPropertyGroupGetArgs(propertyGroupId, propertyMap);
        }
    }
}
