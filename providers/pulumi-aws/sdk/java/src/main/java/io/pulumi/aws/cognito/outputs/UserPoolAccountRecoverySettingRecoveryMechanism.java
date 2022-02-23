// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserPoolAccountRecoverySettingRecoveryMechanism {
    /**
     * Name of the attribute.
     * 
     */
    private final String name;
    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    private final Integer priority;

    @OutputCustomType.Constructor({"name","priority"})
    private UserPoolAccountRecoverySettingRecoveryMechanism(
        String name,
        Integer priority) {
        this.name = Objects.requireNonNull(name);
        this.priority = Objects.requireNonNull(priority);
    }

    /**
     * Name of the attribute.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Positive integer specifying priority of a method with 1 being the highest priority.
     * 
     */
    public Integer getPriority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAccountRecoverySettingRecoveryMechanism defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer priority;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAccountRecoverySettingRecoveryMechanism defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public UserPoolAccountRecoverySettingRecoveryMechanism build() {
            return new UserPoolAccountRecoverySettingRecoveryMechanism(name, priority);
        }
    }
}
