// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A Cardinality condition for the Waiter resource. A cardinality condition is met when the number of variables under a specified path prefix reaches a predefined number. For example, if you set a Cardinality condition where the `path` is set to `/foo` and the number of paths is set to `2`, the following variables would meet the condition in a RuntimeConfig resource: + `/foo/variable1 = "value1"` + `/foo/variable2 = "value2"` + `/bar/variable3 = "value3"` It would not satisfy the same condition with the `number` set to `3`, however, because there is only 2 paths that start with `/foo`. Cardinality conditions are recursive; all subtrees under the specific path prefix are counted.
 * 
 */
public final class CardinalityResponse extends io.pulumi.resources.InvokeArgs {

    public static final CardinalityResponse Empty = new CardinalityResponse();

    /**
     * The number variables under the `path` that must exist to meet this condition. Defaults to 1 if not specified.
     * 
     */
    @Import(name="number", required=true)
      private final Integer number;

    public Integer getNumber() {
        return this.number;
    }

    /**
     * The root of the variable subtree to monitor. For example, `/foo`.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    public CardinalityResponse(
        Integer number,
        String path) {
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private CardinalityResponse() {
        this.number = null;
        this.path = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CardinalityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer number;
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(CardinalityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.number = defaults.number;
    	      this.path = defaults.path;
        }

        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public CardinalityResponse build() {
            return new CardinalityResponse(number, path);
        }
    }
}
