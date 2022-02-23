// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectFeedConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFeedConditionArgs Empty = new ProjectFeedConditionArgs();

    /**
     * Description of the expression. This is a longer text which describes the expression,
     * e.g. when hovered over it in a UI.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @InputImport(name="expression", required=true)
        private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * String indicating the location of the expression for error reporting, e.g. a file
     * name and a position in the file.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * This can be used e.g. in UIs which allow to enter the expression.
     * 
     */
    @InputImport(name="title")
        private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public ProjectFeedConditionArgs(
        @Nullable Input<String> description,
        Input<String> expression,
        @Nullable Input<String> location,
        @Nullable Input<String> title) {
        this.description = description;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.location = location;
        this.title = title;
    }

    private ProjectFeedConditionArgs() {
        this.description = Input.empty();
        this.expression = Input.empty();
        this.location = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> expression;
        private @Nullable Input<String> location;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.location = defaults.location;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public ProjectFeedConditionArgs build() {
            return new ProjectFeedConditionArgs(description, expression, location, title);
        }
    }
}
