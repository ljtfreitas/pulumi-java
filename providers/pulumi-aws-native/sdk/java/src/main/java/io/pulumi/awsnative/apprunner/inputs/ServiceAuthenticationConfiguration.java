// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authentication Configuration
 * 
 */
public final class ServiceAuthenticationConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAuthenticationConfiguration Empty = new ServiceAuthenticationConfiguration();

    /**
     * Access Role Arn
     * 
     */
    @Import(name="accessRoleArn")
      private final @Nullable String accessRoleArn;

    public Optional<String> getAccessRoleArn() {
        return this.accessRoleArn == null ? Optional.empty() : Optional.ofNullable(this.accessRoleArn);
    }

    /**
     * Connection Arn
     * 
     */
    @Import(name="connectionArn")
      private final @Nullable String connectionArn;

    public Optional<String> getConnectionArn() {
        return this.connectionArn == null ? Optional.empty() : Optional.ofNullable(this.connectionArn);
    }

    public ServiceAuthenticationConfiguration(
        @Nullable String accessRoleArn,
        @Nullable String connectionArn) {
        this.accessRoleArn = accessRoleArn;
        this.connectionArn = connectionArn;
    }

    private ServiceAuthenticationConfiguration() {
        this.accessRoleArn = null;
        this.connectionArn = null;
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

        public Builder accessRoleArn(@Nullable String accessRoleArn) {
            this.accessRoleArn = accessRoleArn;
            return this;
        }

        public Builder connectionArn(@Nullable String connectionArn) {
            this.connectionArn = connectionArn;
            return this;
        }
        public ServiceAuthenticationConfiguration build() {
            return new ServiceAuthenticationConfiguration(accessRoleArn, connectionArn);
        }
    }
}
