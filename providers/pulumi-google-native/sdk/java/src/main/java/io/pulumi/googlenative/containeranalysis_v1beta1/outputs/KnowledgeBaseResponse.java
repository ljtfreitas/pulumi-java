// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KnowledgeBaseResponse {
    /**
     * The KB name (generally of the form KB[0-9]+ i.e. KB123456).
     * 
     */
    private final String name;
    /**
     * A link to the KB in the Windows update catalog - https://www.catalog.update.microsoft.com/
     * 
     */
    private final String url;

    @CustomType.Constructor
    private KnowledgeBaseResponse(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("url") String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * The KB name (generally of the form KB[0-9]+ i.e. KB123456).
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A link to the KB in the Windows update catalog - https://www.catalog.update.microsoft.com/
     * 
    */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public KnowledgeBaseResponse build() {
            return new KnowledgeBaseResponse(name, url);
        }
    }
}
