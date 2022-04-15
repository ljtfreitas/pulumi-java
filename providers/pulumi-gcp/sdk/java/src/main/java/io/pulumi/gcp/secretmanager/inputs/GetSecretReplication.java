// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.secretmanager.inputs.GetSecretReplicationUserManaged;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;


public final class GetSecretReplication extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretReplication Empty = new GetSecretReplication();

    @Import(name="automatic", required=true)
      private final Boolean automatic;

    public Boolean automatic() {
        return this.automatic;
    }

    @Import(name="userManageds", required=true)
      private final List<GetSecretReplicationUserManaged> userManageds;

    public List<GetSecretReplicationUserManaged> userManageds() {
        return this.userManageds;
    }

    public GetSecretReplication(
        Boolean automatic,
        List<GetSecretReplicationUserManaged> userManageds) {
        this.automatic = Objects.requireNonNull(automatic, "expected parameter 'automatic' to be non-null");
        this.userManageds = Objects.requireNonNull(userManageds, "expected parameter 'userManageds' to be non-null");
    }

    private GetSecretReplication() {
        this.automatic = null;
        this.userManageds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean automatic;
        private List<GetSecretReplicationUserManaged> userManageds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatic = defaults.automatic;
    	      this.userManageds = defaults.userManageds;
        }

        public Builder automatic(Boolean automatic) {
            this.automatic = Objects.requireNonNull(automatic);
            return this;
        }
        public Builder userManageds(List<GetSecretReplicationUserManaged> userManageds) {
            this.userManageds = Objects.requireNonNull(userManageds);
            return this;
        }
        public Builder userManageds(GetSecretReplicationUserManaged... userManageds) {
            return userManageds(List.of(userManageds));
        }        public GetSecretReplication build() {
            return new GetSecretReplication(automatic, userManageds);
        }
    }
}
