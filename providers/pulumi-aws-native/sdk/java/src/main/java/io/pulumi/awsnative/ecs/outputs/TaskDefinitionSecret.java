// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TaskDefinitionSecret {
    private final String name;
    private final String valueFrom;

    @OutputCustomType.Constructor({"name","valueFrom"})
    private TaskDefinitionSecret(
        String name,
        String valueFrom) {
        this.name = Objects.requireNonNull(name);
        this.valueFrom = Objects.requireNonNull(valueFrom);
    }

    public String getName() {
        return this.name;
    }
    public String getValueFrom() {
        return this.valueFrom;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionSecret defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setValueFrom(String valueFrom) {
            this.valueFrom = Objects.requireNonNull(valueFrom);
            return this;
        }
        public TaskDefinitionSecret build() {
            return new TaskDefinitionSecret(name, valueFrom);
        }
    }
}
