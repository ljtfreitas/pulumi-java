// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetGroupArgs Empty = new GetTargetGroupArgs();

    /**
     * The full ARN of the target group.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The unique name of the target group.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetTargetGroupArgs(
        @Nullable String arn,
        @Nullable String name,
        @Nullable Map<String,String> tags) {
        this.arn = arn;
        this.name = name;
        this.tags = tags;
    }

    private GetTargetGroupArgs() {
        this.arn = null;
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetTargetGroupArgs build() {
            return new GetTargetGroupArgs(arn, name, tags);
        }
    }
}
