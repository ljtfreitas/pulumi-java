// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserGroupResult {
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    private final @Nullable String arn;
    /**
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * 
     */
    private final @Nullable String status;
    /**
     * List of users associated to this user group.
     * 
     */
    private final @Nullable List<String> userIds;

    @OutputCustomType.Constructor({"arn","status","userIds"})
    private GetUserGroupResult(
        @Nullable String arn,
        @Nullable String status,
        @Nullable List<String> userIds) {
        this.arn = arn;
        this.status = status;
        this.userIds = userIds;
    }

    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * List of users associated to this user group.
     * 
     */
    public List<String> getUserIds() {
        return this.userIds == null ? List.of() : this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String status;
        private @Nullable List<String> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.status = defaults.status;
    	      this.userIds = defaults.userIds;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setUserIds(@Nullable List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public GetUserGroupResult build() {
            return new GetUserGroupResult(arn, status, userIds);
        }
    }
}
