// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Database instance local user password validation policy
 * 
 */
public final class PasswordValidationPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final PasswordValidationPolicyResponse Empty = new PasswordValidationPolicyResponse();

    /**
     * The complexity of the password.
     * 
     */
    @InputImport(name="complexity", required=true)
      private final String complexity;

    public String getComplexity() {
        return this.complexity;
    }

    /**
     * Disallow username as a part of the password.
     * 
     */
    @InputImport(name="disallowUsernameSubstring", required=true)
      private final Boolean disallowUsernameSubstring;

    public Boolean getDisallowUsernameSubstring() {
        return this.disallowUsernameSubstring;
    }

    /**
     * Minimum number of characters allowed.
     * 
     */
    @InputImport(name="minLength", required=true)
      private final Integer minLength;

    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL.
     * 
     */
    @InputImport(name="passwordChangeInterval", required=true)
      private final String passwordChangeInterval;

    public String getPasswordChangeInterval() {
        return this.passwordChangeInterval;
    }

    /**
     * Number of previous passwords that cannot be reused.
     * 
     */
    @InputImport(name="reuseInterval", required=true)
      private final Integer reuseInterval;

    public Integer getReuseInterval() {
        return this.reuseInterval;
    }

    public PasswordValidationPolicyResponse(
        String complexity,
        Boolean disallowUsernameSubstring,
        Integer minLength,
        String passwordChangeInterval,
        Integer reuseInterval) {
        this.complexity = Objects.requireNonNull(complexity, "expected parameter 'complexity' to be non-null");
        this.disallowUsernameSubstring = Objects.requireNonNull(disallowUsernameSubstring, "expected parameter 'disallowUsernameSubstring' to be non-null");
        this.minLength = Objects.requireNonNull(minLength, "expected parameter 'minLength' to be non-null");
        this.passwordChangeInterval = Objects.requireNonNull(passwordChangeInterval, "expected parameter 'passwordChangeInterval' to be non-null");
        this.reuseInterval = Objects.requireNonNull(reuseInterval, "expected parameter 'reuseInterval' to be non-null");
    }

    private PasswordValidationPolicyResponse() {
        this.complexity = null;
        this.disallowUsernameSubstring = null;
        this.minLength = null;
        this.passwordChangeInterval = null;
        this.reuseInterval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PasswordValidationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complexity;
        private Boolean disallowUsernameSubstring;
        private Integer minLength;
        private String passwordChangeInterval;
        private Integer reuseInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(PasswordValidationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.disallowUsernameSubstring = defaults.disallowUsernameSubstring;
    	      this.minLength = defaults.minLength;
    	      this.passwordChangeInterval = defaults.passwordChangeInterval;
    	      this.reuseInterval = defaults.reuseInterval;
        }

        public Builder setComplexity(String complexity) {
            this.complexity = Objects.requireNonNull(complexity);
            return this;
        }

        public Builder setDisallowUsernameSubstring(Boolean disallowUsernameSubstring) {
            this.disallowUsernameSubstring = Objects.requireNonNull(disallowUsernameSubstring);
            return this;
        }

        public Builder setMinLength(Integer minLength) {
            this.minLength = Objects.requireNonNull(minLength);
            return this;
        }

        public Builder setPasswordChangeInterval(String passwordChangeInterval) {
            this.passwordChangeInterval = Objects.requireNonNull(passwordChangeInterval);
            return this;
        }

        public Builder setReuseInterval(Integer reuseInterval) {
            this.reuseInterval = Objects.requireNonNull(reuseInterval);
            return this;
        }
        public PasswordValidationPolicyResponse build() {
            return new PasswordValidationPolicyResponse(complexity, disallowUsernameSubstring, minLength, passwordChangeInterval, reuseInterval);
        }
    }
}
