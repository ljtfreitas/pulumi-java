// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceAccountResponse {
    /**
     * Email address of the service account. If empty, default Compute service account will be used.
     * 
     */
    private final String email;
    /**
     * The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
     * 
     */
    private final List<String> scope;

    @CustomType.Constructor
    private ServiceAccountResponse(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("scope") List<String> scope) {
        this.email = email;
        this.scope = scope;
    }

    /**
     * Email address of the service account. If empty, default Compute service account will be used.
     * 
    */
    public String getEmail() {
        return this.email;
    }
    /**
     * The list of scopes to be made available for this service account. If empty, access to all Cloud APIs will be allowed.
     * 
    */
    public List<String> getScope() {
        return this.scope;
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

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder scope(List<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public ServiceAccountResponse build() {
            return new ServiceAccountResponse(email, scope);
        }
    }
}
