// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupAndStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupByteMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupGeoMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupIPSetReferenceStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupLabelMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupNotStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupOrStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupRateBasedStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupRegexMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupRegexPatternSetReferenceStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupSizeConstraintStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupSqliMatchStatement;
import io.pulumi.awsnative.wafv2.outputs.RuleGroupXssMatchStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupStatement {
    private final @Nullable RuleGroupAndStatement andStatement;
    private final @Nullable RuleGroupByteMatchStatement byteMatchStatement;
    private final @Nullable RuleGroupGeoMatchStatement geoMatchStatement;
    private final @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement;
    private final @Nullable RuleGroupLabelMatchStatement labelMatchStatement;
    private final @Nullable RuleGroupNotStatement notStatement;
    private final @Nullable RuleGroupOrStatement orStatement;
    private final @Nullable RuleGroupRateBasedStatement rateBasedStatement;
    private final @Nullable RuleGroupRegexMatchStatement regexMatchStatement;
    private final @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
    private final @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement;
    private final @Nullable RuleGroupSqliMatchStatement sqliMatchStatement;
    private final @Nullable RuleGroupXssMatchStatement xssMatchStatement;

    @CustomType.Constructor
    private RuleGroupStatement(
        @CustomType.Parameter("andStatement") @Nullable RuleGroupAndStatement andStatement,
        @CustomType.Parameter("byteMatchStatement") @Nullable RuleGroupByteMatchStatement byteMatchStatement,
        @CustomType.Parameter("geoMatchStatement") @Nullable RuleGroupGeoMatchStatement geoMatchStatement,
        @CustomType.Parameter("iPSetReferenceStatement") @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement,
        @CustomType.Parameter("labelMatchStatement") @Nullable RuleGroupLabelMatchStatement labelMatchStatement,
        @CustomType.Parameter("notStatement") @Nullable RuleGroupNotStatement notStatement,
        @CustomType.Parameter("orStatement") @Nullable RuleGroupOrStatement orStatement,
        @CustomType.Parameter("rateBasedStatement") @Nullable RuleGroupRateBasedStatement rateBasedStatement,
        @CustomType.Parameter("regexMatchStatement") @Nullable RuleGroupRegexMatchStatement regexMatchStatement,
        @CustomType.Parameter("regexPatternSetReferenceStatement") @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement,
        @CustomType.Parameter("sizeConstraintStatement") @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement,
        @CustomType.Parameter("sqliMatchStatement") @Nullable RuleGroupSqliMatchStatement sqliMatchStatement,
        @CustomType.Parameter("xssMatchStatement") @Nullable RuleGroupXssMatchStatement xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.iPSetReferenceStatement = iPSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.rateBasedStatement = rateBasedStatement;
        this.regexMatchStatement = regexMatchStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    public Optional<RuleGroupAndStatement> getAndStatement() {
        return Optional.ofNullable(this.andStatement);
    }
    public Optional<RuleGroupByteMatchStatement> getByteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }
    public Optional<RuleGroupGeoMatchStatement> getGeoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }
    public Optional<RuleGroupIPSetReferenceStatement> getIPSetReferenceStatement() {
        return Optional.ofNullable(this.iPSetReferenceStatement);
    }
    public Optional<RuleGroupLabelMatchStatement> getLabelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }
    public Optional<RuleGroupNotStatement> getNotStatement() {
        return Optional.ofNullable(this.notStatement);
    }
    public Optional<RuleGroupOrStatement> getOrStatement() {
        return Optional.ofNullable(this.orStatement);
    }
    public Optional<RuleGroupRateBasedStatement> getRateBasedStatement() {
        return Optional.ofNullable(this.rateBasedStatement);
    }
    public Optional<RuleGroupRegexMatchStatement> getRegexMatchStatement() {
        return Optional.ofNullable(this.regexMatchStatement);
    }
    public Optional<RuleGroupRegexPatternSetReferenceStatement> getRegexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }
    public Optional<RuleGroupSizeConstraintStatement> getSizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }
    public Optional<RuleGroupSqliMatchStatement> getSqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }
    public Optional<RuleGroupXssMatchStatement> getXssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupAndStatement andStatement;
        private @Nullable RuleGroupByteMatchStatement byteMatchStatement;
        private @Nullable RuleGroupGeoMatchStatement geoMatchStatement;
        private @Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement;
        private @Nullable RuleGroupLabelMatchStatement labelMatchStatement;
        private @Nullable RuleGroupNotStatement notStatement;
        private @Nullable RuleGroupOrStatement orStatement;
        private @Nullable RuleGroupRateBasedStatement rateBasedStatement;
        private @Nullable RuleGroupRegexMatchStatement regexMatchStatement;
        private @Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement;
        private @Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement;
        private @Nullable RuleGroupSqliMatchStatement sqliMatchStatement;
        private @Nullable RuleGroupXssMatchStatement xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.iPSetReferenceStatement = defaults.iPSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.rateBasedStatement = defaults.rateBasedStatement;
    	      this.regexMatchStatement = defaults.regexMatchStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable RuleGroupAndStatement andStatement) {
            this.andStatement = andStatement;
            return this;
        }

        public Builder byteMatchStatement(@Nullable RuleGroupByteMatchStatement byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(@Nullable RuleGroupGeoMatchStatement geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder iPSetReferenceStatement(@Nullable RuleGroupIPSetReferenceStatement iPSetReferenceStatement) {
            this.iPSetReferenceStatement = iPSetReferenceStatement;
            return this;
        }

        public Builder labelMatchStatement(@Nullable RuleGroupLabelMatchStatement labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder notStatement(@Nullable RuleGroupNotStatement notStatement) {
            this.notStatement = notStatement;
            return this;
        }

        public Builder orStatement(@Nullable RuleGroupOrStatement orStatement) {
            this.orStatement = orStatement;
            return this;
        }

        public Builder rateBasedStatement(@Nullable RuleGroupRateBasedStatement rateBasedStatement) {
            this.rateBasedStatement = rateBasedStatement;
            return this;
        }

        public Builder regexMatchStatement(@Nullable RuleGroupRegexMatchStatement regexMatchStatement) {
            this.regexMatchStatement = regexMatchStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(@Nullable RuleGroupRegexPatternSetReferenceStatement regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder sizeConstraintStatement(@Nullable RuleGroupSizeConstraintStatement sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sqliMatchStatement(@Nullable RuleGroupSqliMatchStatement sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(@Nullable RuleGroupXssMatchStatement xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public RuleGroupStatement build() {
            return new RuleGroupStatement(andStatement, byteMatchStatement, geoMatchStatement, iPSetReferenceStatement, labelMatchStatement, notStatement, orStatement, rateBasedStatement, regexMatchStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
