// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProductArgs Empty = new GetProductArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
      private final @Nullable String acceptLanguage;

    public Optional<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Optional.empty() : Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Product ID.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Tags to apply to the product.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetProductArgs(
        @Nullable String acceptLanguage,
        String id,
        @Nullable Map<String,String> tags) {
        this.acceptLanguage = acceptLanguage;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.tags = tags;
    }

    private GetProductArgs() {
        this.acceptLanguage = null;
        this.id = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceptLanguage;
        private String id;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetProductArgs build() {
            return new GetProductArgs(acceptLanguage, id, tags);
        }
    }
}
