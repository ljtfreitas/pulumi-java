// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolPasswordPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolPasswordPolicyArgs Empty = new UserPoolPasswordPolicyArgs();

    /**
     * Minimum length of the password policy that you have set.
     * 
     */
    @Import(name="minimumLength")
      private final @Nullable Output<Integer> minimumLength;

    public Output<Integer> getMinimumLength() {
        return this.minimumLength == null ? Output.empty() : this.minimumLength;
    }

    /**
     * Whether you have required users to use at least one lowercase letter in their password.
     * 
     */
    @Import(name="requireLowercase")
      private final @Nullable Output<Boolean> requireLowercase;

    public Output<Boolean> getRequireLowercase() {
        return this.requireLowercase == null ? Output.empty() : this.requireLowercase;
    }

    /**
     * Whether you have required users to use at least one number in their password.
     * 
     */
    @Import(name="requireNumbers")
      private final @Nullable Output<Boolean> requireNumbers;

    public Output<Boolean> getRequireNumbers() {
        return this.requireNumbers == null ? Output.empty() : this.requireNumbers;
    }

    /**
     * Whether you have required users to use at least one symbol in their password.
     * 
     */
    @Import(name="requireSymbols")
      private final @Nullable Output<Boolean> requireSymbols;

    public Output<Boolean> getRequireSymbols() {
        return this.requireSymbols == null ? Output.empty() : this.requireSymbols;
    }

    /**
     * Whether you have required users to use at least one uppercase letter in their password.
     * 
     */
    @Import(name="requireUppercase")
      private final @Nullable Output<Boolean> requireUppercase;

    public Output<Boolean> getRequireUppercase() {
        return this.requireUppercase == null ? Output.empty() : this.requireUppercase;
    }

    /**
     * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.
     * 
     */
    @Import(name="temporaryPasswordValidityDays")
      private final @Nullable Output<Integer> temporaryPasswordValidityDays;

    public Output<Integer> getTemporaryPasswordValidityDays() {
        return this.temporaryPasswordValidityDays == null ? Output.empty() : this.temporaryPasswordValidityDays;
    }

    public UserPoolPasswordPolicyArgs(
        @Nullable Output<Integer> minimumLength,
        @Nullable Output<Boolean> requireLowercase,
        @Nullable Output<Boolean> requireNumbers,
        @Nullable Output<Boolean> requireSymbols,
        @Nullable Output<Boolean> requireUppercase,
        @Nullable Output<Integer> temporaryPasswordValidityDays) {
        this.minimumLength = minimumLength;
        this.requireLowercase = requireLowercase;
        this.requireNumbers = requireNumbers;
        this.requireSymbols = requireSymbols;
        this.requireUppercase = requireUppercase;
        this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
    }

    private UserPoolPasswordPolicyArgs() {
        this.minimumLength = Output.empty();
        this.requireLowercase = Output.empty();
        this.requireNumbers = Output.empty();
        this.requireSymbols = Output.empty();
        this.requireUppercase = Output.empty();
        this.temporaryPasswordValidityDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolPasswordPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minimumLength;
        private @Nullable Output<Boolean> requireLowercase;
        private @Nullable Output<Boolean> requireNumbers;
        private @Nullable Output<Boolean> requireSymbols;
        private @Nullable Output<Boolean> requireUppercase;
        private @Nullable Output<Integer> temporaryPasswordValidityDays;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolPasswordPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumLength = defaults.minimumLength;
    	      this.requireLowercase = defaults.requireLowercase;
    	      this.requireNumbers = defaults.requireNumbers;
    	      this.requireSymbols = defaults.requireSymbols;
    	      this.requireUppercase = defaults.requireUppercase;
    	      this.temporaryPasswordValidityDays = defaults.temporaryPasswordValidityDays;
        }

        public Builder minimumLength(@Nullable Output<Integer> minimumLength) {
            this.minimumLength = minimumLength;
            return this;
        }

        public Builder minimumLength(@Nullable Integer minimumLength) {
            this.minimumLength = Output.ofNullable(minimumLength);
            return this;
        }

        public Builder requireLowercase(@Nullable Output<Boolean> requireLowercase) {
            this.requireLowercase = requireLowercase;
            return this;
        }

        public Builder requireLowercase(@Nullable Boolean requireLowercase) {
            this.requireLowercase = Output.ofNullable(requireLowercase);
            return this;
        }

        public Builder requireNumbers(@Nullable Output<Boolean> requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }

        public Builder requireNumbers(@Nullable Boolean requireNumbers) {
            this.requireNumbers = Output.ofNullable(requireNumbers);
            return this;
        }

        public Builder requireSymbols(@Nullable Output<Boolean> requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }

        public Builder requireSymbols(@Nullable Boolean requireSymbols) {
            this.requireSymbols = Output.ofNullable(requireSymbols);
            return this;
        }

        public Builder requireUppercase(@Nullable Output<Boolean> requireUppercase) {
            this.requireUppercase = requireUppercase;
            return this;
        }

        public Builder requireUppercase(@Nullable Boolean requireUppercase) {
            this.requireUppercase = Output.ofNullable(requireUppercase);
            return this;
        }

        public Builder temporaryPasswordValidityDays(@Nullable Output<Integer> temporaryPasswordValidityDays) {
            this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
            return this;
        }

        public Builder temporaryPasswordValidityDays(@Nullable Integer temporaryPasswordValidityDays) {
            this.temporaryPasswordValidityDays = Output.ofNullable(temporaryPasswordValidityDays);
            return this;
        }
        public UserPoolPasswordPolicyArgs build() {
            return new UserPoolPasswordPolicyArgs(minimumLength, requireLowercase, requireNumbers, requireSymbols, requireUppercase, temporaryPasswordValidityDays);
        }
    }
}
