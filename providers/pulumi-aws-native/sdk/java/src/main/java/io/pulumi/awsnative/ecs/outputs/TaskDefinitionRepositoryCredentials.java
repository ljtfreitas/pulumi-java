// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionRepositoryCredentials {
    private final @Nullable String credentialsParameter;

    @OutputCustomType.Constructor({"credentialsParameter"})
    private TaskDefinitionRepositoryCredentials(@Nullable String credentialsParameter) {
        this.credentialsParameter = credentialsParameter;
    }

    public Optional<String> getCredentialsParameter() {
        return Optional.ofNullable(this.credentialsParameter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRepositoryCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String credentialsParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRepositoryCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialsParameter = defaults.credentialsParameter;
        }

        public Builder setCredentialsParameter(@Nullable String credentialsParameter) {
            this.credentialsParameter = credentialsParameter;
            return this;
        }
        public TaskDefinitionRepositoryCredentials build() {
            return new TaskDefinitionRepositoryCredentials(credentialsParameter);
        }
    }
}
