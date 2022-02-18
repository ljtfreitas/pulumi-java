// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Compliance Status details
 * 
 */
public final class ComplianceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComplianceStatusResponse Empty = new ComplianceStatusResponse();

    /**
     * The compliance state of the configuration.
     * 
     */
    @InputImport(name="complianceState", required=true)
    private final String complianceState;

    public String getComplianceState() {
        return this.complianceState;
    }

    /**
     * Datetime the configuration was last applied.
     * 
     */
    @InputImport(name="lastConfigApplied")
    private final @Nullable String lastConfigApplied;

    public Optional<String> getLastConfigApplied() {
        return this.lastConfigApplied == null ? Optional.empty() : Optional.ofNullable(this.lastConfigApplied);
    }

    /**
     * Message from when the configuration was applied.
     * 
     */
    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Level of the message.
     * 
     */
    @InputImport(name="messageLevel")
    private final @Nullable String messageLevel;

    public Optional<String> getMessageLevel() {
        return this.messageLevel == null ? Optional.empty() : Optional.ofNullable(this.messageLevel);
    }

    public ComplianceStatusResponse(
        String complianceState,
        @Nullable String lastConfigApplied,
        @Nullable String message,
        @Nullable String messageLevel) {
        this.complianceState = Objects.requireNonNull(complianceState, "expected parameter 'complianceState' to be non-null");
        this.lastConfigApplied = lastConfigApplied;
        this.message = message;
        this.messageLevel = messageLevel;
    }

    private ComplianceStatusResponse() {
        this.complianceState = null;
        this.lastConfigApplied = null;
        this.message = null;
        this.messageLevel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComplianceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceState;
        private @Nullable String lastConfigApplied;
        private @Nullable String message;
        private @Nullable String messageLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(ComplianceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceState = defaults.complianceState;
    	      this.lastConfigApplied = defaults.lastConfigApplied;
    	      this.message = defaults.message;
    	      this.messageLevel = defaults.messageLevel;
        }

        public Builder setComplianceState(String complianceState) {
            this.complianceState = Objects.requireNonNull(complianceState);
            return this;
        }

        public Builder setLastConfigApplied(@Nullable String lastConfigApplied) {
            this.lastConfigApplied = lastConfigApplied;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setMessageLevel(@Nullable String messageLevel) {
            this.messageLevel = messageLevel;
            return this;
        }

        public ComplianceStatusResponse build() {
            return new ComplianceStatusResponse(complianceState, lastConfigApplied, message, messageLevel);
        }
    }
}
