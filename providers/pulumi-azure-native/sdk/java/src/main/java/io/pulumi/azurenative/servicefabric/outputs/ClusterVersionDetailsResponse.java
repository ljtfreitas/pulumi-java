// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterVersionDetailsResponse {
    /**
     * The Service Fabric runtime version of the cluster.
     * 
     */
    private final @Nullable String codeVersion;
    /**
     * Indicates if this version is for Windows or Linux operating system.
     * 
     */
    private final @Nullable String environment;
    /**
     * The date of expiry of support of the version.
     * 
     */
    private final @Nullable String supportExpiryUtc;

    @OutputCustomType.Constructor({"codeVersion","environment","supportExpiryUtc"})
    private ClusterVersionDetailsResponse(
        @Nullable String codeVersion,
        @Nullable String environment,
        @Nullable String supportExpiryUtc) {
        this.codeVersion = codeVersion;
        this.environment = environment;
        this.supportExpiryUtc = supportExpiryUtc;
    }

    /**
     * The Service Fabric runtime version of the cluster.
     * 
     */
    public Optional<String> getCodeVersion() {
        return Optional.ofNullable(this.codeVersion);
    }
    /**
     * Indicates if this version is for Windows or Linux operating system.
     * 
     */
    public Optional<String> getEnvironment() {
        return Optional.ofNullable(this.environment);
    }
    /**
     * The date of expiry of support of the version.
     * 
     */
    public Optional<String> getSupportExpiryUtc() {
        return Optional.ofNullable(this.supportExpiryUtc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVersionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String codeVersion;
        private @Nullable String environment;
        private @Nullable String supportExpiryUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterVersionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeVersion = defaults.codeVersion;
    	      this.environment = defaults.environment;
    	      this.supportExpiryUtc = defaults.supportExpiryUtc;
        }

        public Builder setCodeVersion(@Nullable String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        public Builder setEnvironment(@Nullable String environment) {
            this.environment = environment;
            return this;
        }

        public Builder setSupportExpiryUtc(@Nullable String supportExpiryUtc) {
            this.supportExpiryUtc = supportExpiryUtc;
            return this;
        }
        public ClusterVersionDetailsResponse build() {
            return new ClusterVersionDetailsResponse(codeVersion, environment, supportExpiryUtc);
        }
    }
}
