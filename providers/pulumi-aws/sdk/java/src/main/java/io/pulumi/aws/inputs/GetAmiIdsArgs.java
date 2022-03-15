// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.aws.inputs.GetAmiIdsFilter;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAmiIdsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAmiIdsArgs Empty = new GetAmiIdsArgs();

    /**
     * Limit search to users with *explicit* launch
     * permission on  the image. Valid items are the numeric account ID or `self`.
     * 
     */
    @Import(name="executableUsers")
      private final @Nullable List<String> executableUsers;

    public List<String> getExecutableUsers() {
        return this.executableUsers == null ? List.of() : this.executableUsers;
    }

    /**
     * One or more name/value pairs to filter off of. There
     * are several valid keys, for a full reference, check out
     * [describe-images in the AWS CLI reference][1].
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetAmiIdsFilter> filters;

    public List<GetAmiIdsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A regex string to apply to the AMI list returned
     * by AWS. This allows more advanced filtering not supported from the AWS API.
     * This filtering is done locally on what AWS returns, and could have a performance
     * impact if the result is large. It is recommended to combine this with other
     * options to narrow down the list AWS returns.
     * 
     */
    @Import(name="nameRegex")
      private final @Nullable String nameRegex;

    public Optional<String> getNameRegex() {
        return this.nameRegex == null ? Optional.empty() : Optional.ofNullable(this.nameRegex);
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

    /**
     * Used to sort AMIs by creation time.
     * 
     */
    @Import(name="sortAscending")
      private final @Nullable Boolean sortAscending;

    public Optional<Boolean> getSortAscending() {
        return this.sortAscending == null ? Optional.empty() : Optional.ofNullable(this.sortAscending);
    }

    public GetAmiIdsArgs(
        @Nullable List<String> executableUsers,
        @Nullable List<GetAmiIdsFilter> filters,
        @Nullable String nameRegex,
        List<String> owners,
        @Nullable Boolean sortAscending) {
        this.executableUsers = executableUsers;
        this.filters = filters;
        this.nameRegex = nameRegex;
        this.owners = Objects.requireNonNull(owners, "expected parameter 'owners' to be non-null");
        this.sortAscending = sortAscending;
    }

    private GetAmiIdsArgs() {
        this.executableUsers = List.of();
        this.filters = List.of();
        this.nameRegex = null;
        this.owners = List.of();
        this.sortAscending = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiIdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> executableUsers;
        private @Nullable List<GetAmiIdsFilter> filters;
        private @Nullable String nameRegex;
        private List<String> owners;
        private @Nullable Boolean sortAscending;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiIdsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableUsers = defaults.executableUsers;
    	      this.filters = defaults.filters;
    	      this.nameRegex = defaults.nameRegex;
    	      this.owners = defaults.owners;
    	      this.sortAscending = defaults.sortAscending;
        }

        public Builder executableUsers(@Nullable List<String> executableUsers) {
            this.executableUsers = executableUsers;
            return this;
        }

        public Builder filters(@Nullable List<GetAmiIdsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }

        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }

        public Builder sortAscending(@Nullable Boolean sortAscending) {
            this.sortAscending = sortAscending;
            return this;
        }
        public GetAmiIdsArgs build() {
            return new GetAmiIdsArgs(executableUsers, filters, nameRegex, owners, sortAscending);
        }
    }
}
