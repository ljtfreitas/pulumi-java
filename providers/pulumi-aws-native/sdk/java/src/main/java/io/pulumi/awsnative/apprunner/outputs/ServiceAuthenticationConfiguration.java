// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceAuthenticationConfiguration {
    /**
     * Access Role Arn
     * 
     */
    private final @Nullable String accessRoleArn;
    /**
     * Connection Arn
     * 
     */
    private final @Nullable String connectionArn;

    @OutputCustomType.Constructor({"accessRoleArn","connectionArn"})
    private ServiceAuthenticationConfiguration(
        @Nullable String accessRoleArn,
        @Nullable String connectionArn) {
        this.accessRoleArn = accessRoleArn;
        this.connectionArn = connectionArn;
    }

    /**
     * Access Role Arn
     * 
     */
    public Optional<String> getAccessRoleArn() {
        return Optional.ofNullable(this.accessRoleArn);
    }
    /**
     * Connection Arn
     * 
     */
    public Optional<String> getConnectionArn() {
        return Optional.ofNullable(this.connectionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuthenticationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessRoleArn;
        private @Nullable String connectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuthenticationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRoleArn = defaults.accessRoleArn;
    	      this.connectionArn = defaults.connectionArn;
        }

        public Builder setAccessRoleArn(@Nullable String accessRoleArn) {
            this.accessRoleArn = accessRoleArn;
            return this;
        }

        public Builder setConnectionArn(@Nullable String connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }
        public ServiceAuthenticationConfiguration build() {
            return new ServiceAuthenticationConfiguration(accessRoleArn, connectionArn);
        }
    }
}
