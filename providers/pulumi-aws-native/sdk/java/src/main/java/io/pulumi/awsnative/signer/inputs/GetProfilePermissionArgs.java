// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.signer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProfilePermissionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProfilePermissionArgs Empty = new GetProfilePermissionArgs();

    @Import(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    @Import(name="statementId", required=true)
      private final String statementId;

    public String getStatementId() {
        return this.statementId;
    }

    public GetProfilePermissionArgs(
        String profileName,
        String statementId) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.statementId = Objects.requireNonNull(statementId, "expected parameter 'statementId' to be non-null");
    }

    private GetProfilePermissionArgs() {
        this.profileName = null;
        this.statementId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfilePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;
        private String statementId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfilePermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.statementId = defaults.statementId;
        }

        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder statementId(String statementId) {
            this.statementId = Objects.requireNonNull(statementId);
            return this;
        }
        public GetProfilePermissionArgs build() {
            return new GetProfilePermissionArgs(profileName, statementId);
        }
    }
}
