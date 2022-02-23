// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupCustomResponseBody {
    /**
     * The payload of the custom response.
     * 
     */
    private final String content;
    /**
     * The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
     * 
     */
    private final String contentType;
    /**
     * A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
     * 
     */
    private final String key;

    @OutputCustomType.Constructor({"content","contentType","key"})
    private RuleGroupCustomResponseBody(
        String content,
        String contentType,
        String key) {
        this.content = Objects.requireNonNull(content);
        this.contentType = Objects.requireNonNull(contentType);
        this.key = Objects.requireNonNull(key);
    }

    /**
     * The payload of the custom response.
     * 
     */
    public String getContent() {
        return this.content;
    }
    /**
     * The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
     * 
     */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
     * 
     */
    public String getKey() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomResponseBody defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentType;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomResponseBody defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.key = defaults.key;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public RuleGroupCustomResponseBody build() {
            return new RuleGroupCustomResponseBody(content, contentType, key);
        }
    }
}
