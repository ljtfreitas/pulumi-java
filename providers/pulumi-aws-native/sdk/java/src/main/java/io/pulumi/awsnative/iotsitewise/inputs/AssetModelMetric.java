// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelExpressionVariable;
import io.pulumi.awsnative.iotsitewise.inputs.AssetModelMetricWindow;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AssetModelMetric extends io.pulumi.resources.InvokeArgs {

    public static final AssetModelMetric Empty = new AssetModelMetric();

    /**
     * The mathematical expression that defines the metric aggregation function. You can specify up to 10 functions per expression.
     * 
     */
    @Import(name="expression", required=true)
      private final String expression;

    public String getExpression() {
        return this.expression;
    }

    /**
     * The list of variables used in the expression.
     * 
     */
    @Import(name="variables", required=true)
      private final List<AssetModelExpressionVariable> variables;

    public List<AssetModelExpressionVariable> getVariables() {
        return this.variables;
    }

    /**
     * The window (time interval) over which AWS IoT SiteWise computes the metric's aggregation expression
     * 
     */
    @Import(name="window", required=true)
      private final AssetModelMetricWindow window;

    public AssetModelMetricWindow getWindow() {
        return this.window;
    }

    public AssetModelMetric(
        String expression,
        List<AssetModelExpressionVariable> variables,
        AssetModelMetricWindow window) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.variables = Objects.requireNonNull(variables, "expected parameter 'variables' to be non-null");
        this.window = Objects.requireNonNull(window, "expected parameter 'window' to be non-null");
    }

    private AssetModelMetric() {
        this.expression = null;
        this.variables = List.of();
        this.window = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelMetric defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expression;
        private List<AssetModelExpressionVariable> variables;
        private AssetModelMetricWindow window;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.variables = defaults.variables;
    	      this.window = defaults.window;
        }

        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder variables(List<AssetModelExpressionVariable> variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }

        public Builder window(AssetModelMetricWindow window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }
        public AssetModelMetric build() {
            return new AssetModelMetric(expression, variables, window);
        }
    }
}
