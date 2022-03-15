// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Identity related configuration, including service account based secure multi-tenancy user mappings.
 * 
 */
public final class IdentityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityConfigArgs Empty = new IdentityConfigArgs();

    /**
     * Map of user to service account.
     * 
     */
    @Import(name="userServiceAccountMapping", required=true)
      private final Output<Map<String,String>> userServiceAccountMapping;

    public Output<Map<String,String>> getUserServiceAccountMapping() {
        return this.userServiceAccountMapping;
    }

    public IdentityConfigArgs(Output<Map<String,String>> userServiceAccountMapping) {
        this.userServiceAccountMapping = Objects.requireNonNull(userServiceAccountMapping, "expected parameter 'userServiceAccountMapping' to be non-null");
    }

    private IdentityConfigArgs() {
        this.userServiceAccountMapping = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> userServiceAccountMapping;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userServiceAccountMapping = defaults.userServiceAccountMapping;
        }

        public Builder userServiceAccountMapping(Output<Map<String,String>> userServiceAccountMapping) {
            this.userServiceAccountMapping = Objects.requireNonNull(userServiceAccountMapping);
            return this;
        }

        public Builder userServiceAccountMapping(Map<String,String> userServiceAccountMapping) {
            this.userServiceAccountMapping = Output.of(Objects.requireNonNull(userServiceAccountMapping));
            return this;
        }
        public IdentityConfigArgs build() {
            return new IdentityConfigArgs(userServiceAccountMapping);
        }
    }
}
