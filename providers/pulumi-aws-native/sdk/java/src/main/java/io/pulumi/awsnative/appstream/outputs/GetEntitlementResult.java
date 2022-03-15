// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appstream.outputs;

import io.pulumi.awsnative.appstream.outputs.EntitlementAttribute;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEntitlementResult {
    private final @Nullable String appVisibility;
    private final @Nullable List<EntitlementAttribute> attributes;
    private final @Nullable String createdTime;
    private final @Nullable String description;
    private final @Nullable String lastModifiedTime;

    @CustomType.Constructor
    private GetEntitlementResult(
        @CustomType.Parameter("appVisibility") @Nullable String appVisibility,
        @CustomType.Parameter("attributes") @Nullable List<EntitlementAttribute> attributes,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("lastModifiedTime") @Nullable String lastModifiedTime) {
        this.appVisibility = appVisibility;
        this.attributes = attributes;
        this.createdTime = createdTime;
        this.description = description;
        this.lastModifiedTime = lastModifiedTime;
    }

    public Optional<String> getAppVisibility() {
        return Optional.ofNullable(this.appVisibility);
    }
    public List<EntitlementAttribute> getAttributes() {
        return this.attributes == null ? List.of() : this.attributes;
    }
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getLastModifiedTime() {
        return Optional.ofNullable(this.lastModifiedTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntitlementResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appVisibility;
        private @Nullable List<EntitlementAttribute> attributes;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String lastModifiedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntitlementResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appVisibility = defaults.appVisibility;
    	      this.attributes = defaults.attributes;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
        }

        public Builder appVisibility(@Nullable String appVisibility) {
            this.appVisibility = appVisibility;
            return this;
        }

        public Builder attributes(@Nullable List<EntitlementAttribute> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder lastModifiedTime(@Nullable String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public GetEntitlementResult build() {
            return new GetEntitlementResult(appVisibility, attributes, createdTime, description, lastModifiedTime);
        }
    }
}
