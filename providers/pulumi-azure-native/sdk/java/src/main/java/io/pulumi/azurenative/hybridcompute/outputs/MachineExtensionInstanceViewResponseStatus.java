// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MachineExtensionInstanceViewResponseStatus {
    /**
     * The status code.
     * 
     */
    private final String code;
    /**
     * The short localizable label for the status.
     * 
     */
    private final String displayStatus;
    /**
     * The level code.
     * 
     */
    private final String level;
    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    private final String message;
    /**
     * The time of the status.
     * 
     */
    private final String time;

    @OutputCustomType.Constructor({"code","displayStatus","level","message","time"})
    private MachineExtensionInstanceViewResponseStatus(
        String code,
        String displayStatus,
        String level,
        String message,
        String time) {
        this.code = Objects.requireNonNull(code);
        this.displayStatus = Objects.requireNonNull(displayStatus);
        this.level = Objects.requireNonNull(level);
        this.message = Objects.requireNonNull(message);
        this.time = Objects.requireNonNull(time);
    }

    /**
     * The status code.
     * 
     */
    public String getCode() {
        return this.code;
    }
    /**
     * The short localizable label for the status.
     * 
     */
    public String getDisplayStatus() {
        return this.displayStatus;
    }
    /**
     * The level code.
     * 
     */
    public String getLevel() {
        return this.level;
    }
    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * The time of the status.
     * 
     */
    public String getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionInstanceViewResponseStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String displayStatus;
        private String level;
        private String message;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionInstanceViewResponseStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDisplayStatus(String displayStatus) {
            this.displayStatus = Objects.requireNonNull(displayStatus);
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }

        public MachineExtensionInstanceViewResponseStatus build() {
            return new MachineExtensionInstanceViewResponseStatus(code, displayStatus, level, message, time);
        }
    }
}
