// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListenerRuleConditionHttpHeader {
    /**
     * Name of HTTP header to search. The maximum size is 40 characters. Comparison is case insensitive. Only RFC7240 characters are supported. Wildcards are not supported. You cannot use HTTP header condition to specify the host header, use a `host-header` condition instead.
     * 
     */
    private final String httpHeaderName;
    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private ListenerRuleConditionHttpHeader(
        @CustomType.Parameter("httpHeaderName") String httpHeaderName,
        @CustomType.Parameter("values") List<String> values) {
        this.httpHeaderName = httpHeaderName;
        this.values = values;
    }

    /**
     * Name of HTTP header to search. The maximum size is 40 characters. Comparison is case insensitive. Only RFC7240 characters are supported. Wildcards are not supported. You cannot use HTTP header condition to specify the host header, use a `host-header` condition instead.
     * 
    */
    public String getHttpHeaderName() {
        return this.httpHeaderName;
    }
    /**
     * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionHttpHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpHeaderName;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionHttpHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.values = defaults.values;
        }

        public Builder httpHeaderName(String httpHeaderName) {
            this.httpHeaderName = Objects.requireNonNull(httpHeaderName);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ListenerRuleConditionHttpHeader build() {
            return new ListenerRuleConditionHttpHeader(httpHeaderName, values);
        }
    }
}
