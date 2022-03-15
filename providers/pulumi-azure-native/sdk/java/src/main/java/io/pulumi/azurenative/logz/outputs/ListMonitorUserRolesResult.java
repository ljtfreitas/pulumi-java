// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.UserRoleResponseResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListMonitorUserRolesResult {
    /**
     * Link to the next set of results, if any.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * List of user roles for Logz.io account.
     * 
     */
    private final @Nullable List<UserRoleResponseResponse> value;

    @CustomType.Constructor
    private ListMonitorUserRolesResult(
        @CustomType.Parameter("nextLink") @Nullable String nextLink,
        @CustomType.Parameter("value") @Nullable List<UserRoleResponseResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to the next set of results, if any.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * List of user roles for Logz.io account.
     * 
    */
    public List<UserRoleResponseResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListMonitorUserRolesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<UserRoleResponseResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListMonitorUserRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder value(@Nullable List<UserRoleResponseResponse> value) {
            this.value = value;
            return this;
        }
        public ListMonitorUserRolesResult build() {
            return new ListMonitorUserRolesResult(nextLink, value);
        }
    }
}
