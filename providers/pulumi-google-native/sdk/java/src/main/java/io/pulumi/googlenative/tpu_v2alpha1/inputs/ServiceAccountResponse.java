// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A service account.
 * 
 */
public final class ServiceAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAccountResponse Empty = new ServiceAccountResponse();

    /**
     * Email address of the service account. If empty, default Compute service account will be used.
     * 
     */
    @InputImport(name="email", required=true)
      private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
     * 
     */
    @InputImport(name="scope", required=true)
      private final List<String> scope;

    public List<String> getScope() {
        return this.scope;
    }

    public ServiceAccountResponse(
        String email,
        List<String> scope) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private ServiceAccountResponse() {
        this.email = null;
        this.scope = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private List<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scope = defaults.scope;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setScope(List<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public ServiceAccountResponse build() {
            return new ServiceAccountResponse(email, scope);
        }
    }
}
