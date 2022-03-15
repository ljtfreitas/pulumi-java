// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationFeedCondition {
    /**
     * Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    private final @Nullable String description;
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    private final String expression;
    /**
     * String indicating the location of the expression for error reporting, e.g. a file
     * name and a position in the file.
     * 
     */
    private final @Nullable String location;
    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    private final @Nullable String title;

    @CustomType.Constructor
    private OrganizationFeedCondition(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expression") String expression,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("title") @Nullable String title) {
        this.description = description;
        this.expression = expression;
        this.location = location;
        this.title = title;
    }

    /**
     * Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
    */
    public String getExpression() {
        return this.expression;
    }
    /**
     * String indicating the location of the expression for error reporting, e.g. a file
     * name and a position in the file.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * This can be used e.g. in UIs which allow to enter the expression.
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationFeedCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String expression;
        private @Nullable String location;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationFeedCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public OrganizationFeedCondition build() {
            return new OrganizationFeedCondition(description, expression, location, title);
        }
    }
}
