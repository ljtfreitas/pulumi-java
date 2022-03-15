// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRolesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRolesArgs Empty = new GetRolesArgs();

    /**
     * A regex string to apply to the IAM roles list returned by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    @Import(name="nameRegex")
      private final @Nullable String nameRegex;

    public Optional<String> getNameRegex() {
        return this.nameRegex == null ? Optional.empty() : Optional.ofNullable(this.nameRegex);
    }

    /**
     * The path prefix for filtering the results. For example, the prefix `/application_abc/component_xyz/` gets all roles whose path starts with `/application_abc/component_xyz/`. If it is not included, it defaults to a slash (`/`), listing all roles. For more details, check out [list-roles in the AWS CLI reference][1].
     * 
     */
    @Import(name="pathPrefix")
      private final @Nullable String pathPrefix;

    public Optional<String> getPathPrefix() {
        return this.pathPrefix == null ? Optional.empty() : Optional.ofNullable(this.pathPrefix);
    }

    public GetRolesArgs(
        @Nullable String nameRegex,
        @Nullable String pathPrefix) {
        this.nameRegex = nameRegex;
        this.pathPrefix = pathPrefix;
    }

    private GetRolesArgs() {
        this.nameRegex = null;
        this.pathPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nameRegex;
        private @Nullable String pathPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRolesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameRegex = defaults.nameRegex;
    	      this.pathPrefix = defaults.pathPrefix;
        }

        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }

        public Builder pathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public GetRolesArgs build() {
            return new GetRolesArgs(nameRegex, pathPrefix);
        }
    }
}
