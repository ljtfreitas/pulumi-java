// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2_getAmi.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAmiArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAmiArgs Empty = new GetAmiArgs();

    /**
     * Limit search to users with *explicit* launch permission on
     * the image. Valid items are the numeric account ID or `self`.
     * 
     */
    @Import(name="executableUsers")
      private final @Nullable List<String> executableUsers;

    public List<String> getExecutableUsers() {
        return this.executableUsers == null ? List.of() : this.executableUsers;
    }

    /**
     * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g., `amazon`, `aws-marketplace`, `microsoft`).
     * 
     */
    @Import(name="owners", required=true)
      private final List<String> owners;

    public List<String> getOwners() {
        return this.owners;
    }

    public GetAmiArgs(
        @Nullable List<String> executableUsers,
        List<String> owners) {
        this.executableUsers = executableUsers;
        this.owners = Objects.requireNonNull(owners, "expected parameter 'owners' to be non-null");
    }

    private GetAmiArgs() {
        this.executableUsers = List.of();
        this.owners = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> executableUsers;
        private List<String> owners;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableUsers = defaults.executableUsers;
    	      this.owners = defaults.owners;
        }

        public Builder executableUsers(@Nullable List<String> executableUsers) {
            this.executableUsers = executableUsers;
            return this;
        }

        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }
        public GetAmiArgs build() {
            return new GetAmiArgs(executableUsers, owners);
        }
    }
}
