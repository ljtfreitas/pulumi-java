// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.outputs;

import io.pulumi.awsnative.route53recoveryreadiness.outputs.ReadinessCheckTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetReadinessCheckResult {
    /**
     * The Amazon Resource Name (ARN) of the readiness check.
     * 
     */
    private final @Nullable String readinessCheckArn;
    /**
     * The name of the resource set to check.
     * 
     */
    private final @Nullable String resourceSetName;
    /**
     * A collection of tags associated with a resource.
     * 
     */
    private final @Nullable List<ReadinessCheckTag> tags;

    @OutputCustomType.Constructor
    private GetReadinessCheckResult(
        @OutputCustomType.Parameter("readinessCheckArn") @Nullable String readinessCheckArn,
        @OutputCustomType.Parameter("resourceSetName") @Nullable String resourceSetName,
        @OutputCustomType.Parameter("tags") @Nullable List<ReadinessCheckTag> tags) {
        this.readinessCheckArn = readinessCheckArn;
        this.resourceSetName = resourceSetName;
        this.tags = tags;
    }

    /**
     * The Amazon Resource Name (ARN) of the readiness check.
     * 
    */
    public Optional<String> getReadinessCheckArn() {
        return Optional.ofNullable(this.readinessCheckArn);
    }
    /**
     * The name of the resource set to check.
     * 
    */
    public Optional<String> getResourceSetName() {
        return Optional.ofNullable(this.resourceSetName);
    }
    /**
     * A collection of tags associated with a resource.
     * 
    */
    public List<ReadinessCheckTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReadinessCheckResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String readinessCheckArn;
        private @Nullable String resourceSetName;
        private @Nullable List<ReadinessCheckTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReadinessCheckResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.readinessCheckArn = defaults.readinessCheckArn;
    	      this.resourceSetName = defaults.resourceSetName;
    	      this.tags = defaults.tags;
        }

        public Builder setReadinessCheckArn(@Nullable String readinessCheckArn) {
            this.readinessCheckArn = readinessCheckArn;
            return this;
        }

        public Builder setResourceSetName(@Nullable String resourceSetName) {
            this.resourceSetName = resourceSetName;
            return this;
        }

        public Builder setTags(@Nullable List<ReadinessCheckTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetReadinessCheckResult build() {
            return new GetReadinessCheckResult(readinessCheckArn, resourceSetName, tags);
        }
    }
}
