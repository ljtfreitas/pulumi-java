// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLPositionalConstraint;
import io.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatch;
import io.pulumi.awsnative.wafv2.inputs.WebACLTextTransformation;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Byte Match statement.
 * 
 */
public final class WebACLByteMatchStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLByteMatchStatement Empty = new WebACLByteMatchStatement();

    @Import(name="fieldToMatch", required=true)
      private final WebACLFieldToMatch fieldToMatch;

    public WebACLFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="positionalConstraint", required=true)
      private final WebACLPositionalConstraint positionalConstraint;

    public WebACLPositionalConstraint getPositionalConstraint() {
        return this.positionalConstraint;
    }

    @Import(name="searchString")
      private final @Nullable String searchString;

    public Optional<String> getSearchString() {
        return this.searchString == null ? Optional.empty() : Optional.ofNullable(this.searchString);
    }

    @Import(name="searchStringBase64")
      private final @Nullable String searchStringBase64;

    public Optional<String> getSearchStringBase64() {
        return this.searchStringBase64 == null ? Optional.empty() : Optional.ofNullable(this.searchStringBase64);
    }

    @Import(name="textTransformations", required=true)
      private final List<WebACLTextTransformation> textTransformations;

    public List<WebACLTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public WebACLByteMatchStatement(
        WebACLFieldToMatch fieldToMatch,
        WebACLPositionalConstraint positionalConstraint,
        @Nullable String searchString,
        @Nullable String searchStringBase64,
        List<WebACLTextTransformation> textTransformations) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
        this.searchString = searchString;
        this.searchStringBase64 = searchStringBase64;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebACLByteMatchStatement() {
        this.fieldToMatch = null;
        this.positionalConstraint = null;
        this.searchString = null;
        this.searchStringBase64 = null;
        this.textTransformations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLByteMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLFieldToMatch fieldToMatch;
        private WebACLPositionalConstraint positionalConstraint;
        private @Nullable String searchString;
        private @Nullable String searchStringBase64;
        private List<WebACLTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLByteMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.searchString = defaults.searchString;
    	      this.searchStringBase64 = defaults.searchStringBase64;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(WebACLFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder positionalConstraint(WebACLPositionalConstraint positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder searchString(@Nullable String searchString) {
            this.searchString = searchString;
            return this;
        }

        public Builder searchStringBase64(@Nullable String searchStringBase64) {
            this.searchStringBase64 = searchStringBase64;
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebACLByteMatchStatement build() {
            return new WebACLByteMatchStatement(fieldToMatch, positionalConstraint, searchString, searchStringBase64, textTransformations);
        }
    }
}
