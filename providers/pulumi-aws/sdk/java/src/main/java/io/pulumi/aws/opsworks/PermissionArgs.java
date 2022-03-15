// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PermissionArgs Empty = new PermissionArgs();

    /**
     * Whether the user is allowed to use SSH to communicate with the instance
     * 
     */
    @Import(name="allowSsh")
      private final @Nullable Output<Boolean> allowSsh;

    public Output<Boolean> getAllowSsh() {
        return this.allowSsh == null ? Output.empty() : this.allowSsh;
    }

    /**
     * Whether the user is allowed to use sudo to elevate privileges
     * 
     */
    @Import(name="allowSudo")
      private final @Nullable Output<Boolean> allowSudo;

    public Output<Boolean> getAllowSudo() {
        return this.allowSudo == null ? Output.empty() : this.allowSudo;
    }

    /**
     * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iam_only`
     * 
     */
    @Import(name="level")
      private final @Nullable Output<String> level;

    public Output<String> getLevel() {
        return this.level == null ? Output.empty() : this.level;
    }

    /**
     * The stack to set the permissions for
     * 
     */
    @Import(name="stackId")
      private final @Nullable Output<String> stackId;

    public Output<String> getStackId() {
        return this.stackId == null ? Output.empty() : this.stackId;
    }

    /**
     * The user's IAM ARN to set permissions for
     * 
     */
    @Import(name="userArn", required=true)
      private final Output<String> userArn;

    public Output<String> getUserArn() {
        return this.userArn;
    }

    public PermissionArgs(
        @Nullable Output<Boolean> allowSsh,
        @Nullable Output<Boolean> allowSudo,
        @Nullable Output<String> level,
        @Nullable Output<String> stackId,
        Output<String> userArn) {
        this.allowSsh = allowSsh;
        this.allowSudo = allowSudo;
        this.level = level;
        this.stackId = stackId;
        this.userArn = Objects.requireNonNull(userArn, "expected parameter 'userArn' to be non-null");
    }

    private PermissionArgs() {
        this.allowSsh = Output.empty();
        this.allowSudo = Output.empty();
        this.level = Output.empty();
        this.stackId = Output.empty();
        this.userArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowSsh;
        private @Nullable Output<Boolean> allowSudo;
        private @Nullable Output<String> level;
        private @Nullable Output<String> stackId;
        private Output<String> userArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSsh = defaults.allowSsh;
    	      this.allowSudo = defaults.allowSudo;
    	      this.level = defaults.level;
    	      this.stackId = defaults.stackId;
    	      this.userArn = defaults.userArn;
        }

        public Builder allowSsh(@Nullable Output<Boolean> allowSsh) {
            this.allowSsh = allowSsh;
            return this;
        }

        public Builder allowSsh(@Nullable Boolean allowSsh) {
            this.allowSsh = Output.ofNullable(allowSsh);
            return this;
        }

        public Builder allowSudo(@Nullable Output<Boolean> allowSudo) {
            this.allowSudo = allowSudo;
            return this;
        }

        public Builder allowSudo(@Nullable Boolean allowSudo) {
            this.allowSudo = Output.ofNullable(allowSudo);
            return this;
        }

        public Builder level(@Nullable Output<String> level) {
            this.level = level;
            return this;
        }

        public Builder level(@Nullable String level) {
            this.level = Output.ofNullable(level);
            return this;
        }

        public Builder stackId(@Nullable Output<String> stackId) {
            this.stackId = stackId;
            return this;
        }

        public Builder stackId(@Nullable String stackId) {
            this.stackId = Output.ofNullable(stackId);
            return this;
        }

        public Builder userArn(Output<String> userArn) {
            this.userArn = Objects.requireNonNull(userArn);
            return this;
        }

        public Builder userArn(String userArn) {
            this.userArn = Output.of(Objects.requireNonNull(userArn));
            return this;
        }
        public PermissionArgs build() {
            return new PermissionArgs(allowSsh, allowSudo, level, stackId, userArn);
        }
    }
}
