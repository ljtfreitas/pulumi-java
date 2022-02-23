// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolPasswordPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolPasswordPolicyGetArgs Empty = new UserPoolPasswordPolicyGetArgs();

    /**
     * Minimum length of the password policy that you have set.
     * 
     */
    @InputImport(name="minimumLength")
    private final @Nullable Input<Integer> minimumLength;

    public Input<Integer> getMinimumLength() {
        return this.minimumLength == null ? Input.empty() : this.minimumLength;
    }

    /**
     * Whether you have required users to use at least one lowercase letter in their password.
     * 
     */
    @InputImport(name="requireLowercase")
    private final @Nullable Input<Boolean> requireLowercase;

    public Input<Boolean> getRequireLowercase() {
        return this.requireLowercase == null ? Input.empty() : this.requireLowercase;
    }

    /**
     * Whether you have required users to use at least one number in their password.
     * 
     */
    @InputImport(name="requireNumbers")
    private final @Nullable Input<Boolean> requireNumbers;

    public Input<Boolean> getRequireNumbers() {
        return this.requireNumbers == null ? Input.empty() : this.requireNumbers;
    }

    /**
     * Whether you have required users to use at least one symbol in their password.
     * 
     */
    @InputImport(name="requireSymbols")
    private final @Nullable Input<Boolean> requireSymbols;

    public Input<Boolean> getRequireSymbols() {
        return this.requireSymbols == null ? Input.empty() : this.requireSymbols;
    }

    /**
     * Whether you have required users to use at least one uppercase letter in their password.
     * 
     */
    @InputImport(name="requireUppercase")
    private final @Nullable Input<Boolean> requireUppercase;

    public Input<Boolean> getRequireUppercase() {
        return this.requireUppercase == null ? Input.empty() : this.requireUppercase;
    }

    /**
     * In the password policy you have set, refers to the number of days a temporary password is valid. If the user does not sign-in during this time, their password will need to be reset by an administrator.
     * 
     */
    @InputImport(name="temporaryPasswordValidityDays")
    private final @Nullable Input<Integer> temporaryPasswordValidityDays;

    public Input<Integer> getTemporaryPasswordValidityDays() {
        return this.temporaryPasswordValidityDays == null ? Input.empty() : this.temporaryPasswordValidityDays;
    }

    public UserPoolPasswordPolicyGetArgs(
        @Nullable Input<Integer> minimumLength,
        @Nullable Input<Boolean> requireLowercase,
        @Nullable Input<Boolean> requireNumbers,
        @Nullable Input<Boolean> requireSymbols,
        @Nullable Input<Boolean> requireUppercase,
        @Nullable Input<Integer> temporaryPasswordValidityDays) {
        this.minimumLength = minimumLength;
        this.requireLowercase = requireLowercase;
        this.requireNumbers = requireNumbers;
        this.requireSymbols = requireSymbols;
        this.requireUppercase = requireUppercase;
        this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
    }

    private UserPoolPasswordPolicyGetArgs() {
        this.minimumLength = Input.empty();
        this.requireLowercase = Input.empty();
        this.requireNumbers = Input.empty();
        this.requireSymbols = Input.empty();
        this.requireUppercase = Input.empty();
        this.temporaryPasswordValidityDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolPasswordPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minimumLength;
        private @Nullable Input<Boolean> requireLowercase;
        private @Nullable Input<Boolean> requireNumbers;
        private @Nullable Input<Boolean> requireSymbols;
        private @Nullable Input<Boolean> requireUppercase;
        private @Nullable Input<Integer> temporaryPasswordValidityDays;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolPasswordPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumLength = defaults.minimumLength;
    	      this.requireLowercase = defaults.requireLowercase;
    	      this.requireNumbers = defaults.requireNumbers;
    	      this.requireSymbols = defaults.requireSymbols;
    	      this.requireUppercase = defaults.requireUppercase;
    	      this.temporaryPasswordValidityDays = defaults.temporaryPasswordValidityDays;
        }

        public Builder setMinimumLength(@Nullable Input<Integer> minimumLength) {
            this.minimumLength = minimumLength;
            return this;
        }

        public Builder setMinimumLength(@Nullable Integer minimumLength) {
            this.minimumLength = Input.ofNullable(minimumLength);
            return this;
        }

        public Builder setRequireLowercase(@Nullable Input<Boolean> requireLowercase) {
            this.requireLowercase = requireLowercase;
            return this;
        }

        public Builder setRequireLowercase(@Nullable Boolean requireLowercase) {
            this.requireLowercase = Input.ofNullable(requireLowercase);
            return this;
        }

        public Builder setRequireNumbers(@Nullable Input<Boolean> requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }

        public Builder setRequireNumbers(@Nullable Boolean requireNumbers) {
            this.requireNumbers = Input.ofNullable(requireNumbers);
            return this;
        }

        public Builder setRequireSymbols(@Nullable Input<Boolean> requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }

        public Builder setRequireSymbols(@Nullable Boolean requireSymbols) {
            this.requireSymbols = Input.ofNullable(requireSymbols);
            return this;
        }

        public Builder setRequireUppercase(@Nullable Input<Boolean> requireUppercase) {
            this.requireUppercase = requireUppercase;
            return this;
        }

        public Builder setRequireUppercase(@Nullable Boolean requireUppercase) {
            this.requireUppercase = Input.ofNullable(requireUppercase);
            return this;
        }

        public Builder setTemporaryPasswordValidityDays(@Nullable Input<Integer> temporaryPasswordValidityDays) {
            this.temporaryPasswordValidityDays = temporaryPasswordValidityDays;
            return this;
        }

        public Builder setTemporaryPasswordValidityDays(@Nullable Integer temporaryPasswordValidityDays) {
            this.temporaryPasswordValidityDays = Input.ofNullable(temporaryPasswordValidityDays);
            return this;
        }
        public UserPoolPasswordPolicyGetArgs build() {
            return new UserPoolPasswordPolicyGetArgs(minimumLength, requireLowercase, requireNumbers, requireSymbols, requireUppercase, temporaryPasswordValidityDays);
        }
    }
}
