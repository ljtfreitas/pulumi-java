// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.outputs;

import io.pulumi.awsnative.memorydb.outputs.UserTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserResult {
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    private final @Nullable String arn;
    /**
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * 
     */
    private final @Nullable String status;
    /**
     * An array of key-value pairs to apply to this user.
     * 
     */
    private final @Nullable List<UserTag> tags;

    @OutputCustomType.Constructor({"arn","status","tags"})
    private GetUserResult(
        @Nullable String arn,
        @Nullable String status,
        @Nullable List<UserTag> tags) {
        this.arn = arn;
        this.status = status;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Indicates the user status. Can be "active", "modifying" or "deleting".
     * 
     */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * An array of key-value pairs to apply to this user.
     * 
     */
    public List<UserTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String status;
        private @Nullable List<UserTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setTags(@Nullable List<UserTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetUserResult build() {
            return new GetUserResult(arn, status, tags);
        }
    }
}
