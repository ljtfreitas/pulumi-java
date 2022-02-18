// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExcludedServicesConfigResponse {
    /**
     * The config id of excluded services.
     * 
     */
    private final @Nullable String excludedServicesConfigId;
    /**
     * The list of excluded services.
     * 
     */
    private final @Nullable String excludedServicesList;

    @OutputCustomType.Constructor({"excludedServicesConfigId","excludedServicesList"})
    private ExcludedServicesConfigResponse(
        @Nullable String excludedServicesConfigId,
        @Nullable String excludedServicesList) {
        this.excludedServicesConfigId = excludedServicesConfigId;
        this.excludedServicesList = excludedServicesList;
    }

    /**
     * The config id of excluded services.
     * 
     */
    public Optional<String> getExcludedServicesConfigId() {
        return Optional.ofNullable(this.excludedServicesConfigId);
    }
    /**
     * The list of excluded services.
     * 
     */
    public Optional<String> getExcludedServicesList() {
        return Optional.ofNullable(this.excludedServicesList);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExcludedServicesConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String excludedServicesConfigId;
        private @Nullable String excludedServicesList;

        public Builder() {
    	      // Empty
        }

        public Builder(ExcludedServicesConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedServicesConfigId = defaults.excludedServicesConfigId;
    	      this.excludedServicesList = defaults.excludedServicesList;
        }

        public Builder setExcludedServicesConfigId(@Nullable String excludedServicesConfigId) {
            this.excludedServicesConfigId = excludedServicesConfigId;
            return this;
        }

        public Builder setExcludedServicesList(@Nullable String excludedServicesList) {
            this.excludedServicesList = excludedServicesList;
            return this;
        }

        public ExcludedServicesConfigResponse build() {
            return new ExcludedServicesConfigResponse(excludedServicesConfigId, excludedServicesList);
        }
    }
}
