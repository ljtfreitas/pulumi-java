// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A representation of a Datastore kind.
 * 
 */
public final class GooglePrivacyDlpV2KindExpressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2KindExpressionArgs Empty = new GooglePrivacyDlpV2KindExpressionArgs();

    /**
     * The name of the kind.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public GooglePrivacyDlpV2KindExpressionArgs(@Nullable Output<String> name) {
        this.name = name;
    }

    private GooglePrivacyDlpV2KindExpressionArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KindExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KindExpressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public GooglePrivacyDlpV2KindExpressionArgs build() {
            return new GooglePrivacyDlpV2KindExpressionArgs(name);
        }
    }
}
