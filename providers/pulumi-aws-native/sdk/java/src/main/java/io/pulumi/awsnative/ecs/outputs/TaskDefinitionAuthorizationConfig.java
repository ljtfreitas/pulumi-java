// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.enums.TaskDefinitionAuthorizationConfigIAM;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionAuthorizationConfig {
    private final @Nullable String accessPointId;
    private final @Nullable TaskDefinitionAuthorizationConfigIAM iAM;

    @OutputCustomType.Constructor({"accessPointId","iAM"})
    private TaskDefinitionAuthorizationConfig(
        @Nullable String accessPointId,
        @Nullable TaskDefinitionAuthorizationConfigIAM iAM) {
        this.accessPointId = accessPointId;
        this.iAM = iAM;
    }

    public Optional<String> getAccessPointId() {
        return Optional.ofNullable(this.accessPointId);
    }
    public Optional<TaskDefinitionAuthorizationConfigIAM> getIAM() {
        return Optional.ofNullable(this.iAM);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionAuthorizationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPointId;
        private @Nullable TaskDefinitionAuthorizationConfigIAM iAM;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionAuthorizationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointId = defaults.accessPointId;
    	      this.iAM = defaults.iAM;
        }

        public Builder setAccessPointId(@Nullable String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }

        public Builder setIAM(@Nullable TaskDefinitionAuthorizationConfigIAM iAM) {
            this.iAM = iAM;
            return this;
        }
        public TaskDefinitionAuthorizationConfig build() {
            return new TaskDefinitionAuthorizationConfig(accessPointId, iAM);
        }
    }
}
