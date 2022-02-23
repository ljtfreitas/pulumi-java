// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.outputs;

import io.pulumi.awsnative.refactorspaces.outputs.ServiceTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServiceResult {
    private final @Nullable String arn;
    private final @Nullable String serviceIdentifier;
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    private final @Nullable List<ServiceTag> tags;

    @OutputCustomType.Constructor({"arn","serviceIdentifier","tags"})
    private GetServiceResult(
        @Nullable String arn,
        @Nullable String serviceIdentifier,
        @Nullable List<ServiceTag> tags) {
        this.arn = arn;
        this.serviceIdentifier = serviceIdentifier;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getServiceIdentifier() {
        return Optional.ofNullable(this.serviceIdentifier);
    }
    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    public List<ServiceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String serviceIdentifier;
        private @Nullable List<ServiceTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.serviceIdentifier = defaults.serviceIdentifier;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setServiceIdentifier(@Nullable String serviceIdentifier) {
            this.serviceIdentifier = serviceIdentifier;
            return this;
        }

        public Builder setTags(@Nullable List<ServiceTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(arn, serviceIdentifier, tags);
        }
    }
}
