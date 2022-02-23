// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusIngressPolicyIngressFromGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusIngressPolicyIngressFromGetArgs Empty = new ServicePerimeterStatusIngressPolicyIngressFromGetArgs();

    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    @InputImport(name="identities")
        private final @Nullable Input<List<String>> identities;

    public Input<List<String>> getIdentities() {
        return this.identities == null ? Input.empty() : this.identities;
    }

    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    @InputImport(name="identityType")
        private final @Nullable Input<String> identityType;

    public Input<String> getIdentityType() {
        return this.identityType == null ? Input.empty() : this.identityType;
    }

    /**
     * Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sources")
        private final @Nullable Input<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources;

    public Input<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    public ServicePerimeterStatusIngressPolicyIngressFromGetArgs(
        @Nullable Input<List<String>> identities,
        @Nullable Input<String> identityType,
        @Nullable Input<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources) {
        this.identities = identities;
        this.identityType = identityType;
        this.sources = sources;
    }

    private ServicePerimeterStatusIngressPolicyIngressFromGetArgs() {
        this.identities = Input.empty();
        this.identityType = Input.empty();
        this.sources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusIngressPolicyIngressFromGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> identities;
        private @Nullable Input<String> identityType;
        private @Nullable Input<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusIngressPolicyIngressFromGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        public Builder setIdentities(@Nullable Input<List<String>> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setIdentities(@Nullable List<String> identities) {
            this.identities = Input.ofNullable(identities);
            return this;
        }

        public Builder setIdentityType(@Nullable Input<String> identityType) {
            this.identityType = identityType;
            return this;
        }

        public Builder setIdentityType(@Nullable String identityType) {
            this.identityType = Input.ofNullable(identityType);
            return this;
        }

        public Builder setSources(@Nullable Input<List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setSources(@Nullable List<ServicePerimeterStatusIngressPolicyIngressFromSourceGetArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }
        public ServicePerimeterStatusIngressPolicyIngressFromGetArgs build() {
            return new ServicePerimeterStatusIngressPolicyIngressFromGetArgs(identities, identityType, sources);
        }
    }
}
