// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.DocumentationRuleResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.PageResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DocumentationResponse {
    /**
     * The URL to the root of documentation.
     * 
     */
    private final String documentationRootUrl;
    /**
     * Declares a single overview page. For example: documentation: summary: ... overview: (== include overview.md ==) This is a shortcut for the following declaration (using pages style): documentation: summary: ... pages: - name: Overview content: (== include overview.md ==) Note: you cannot specify both `overview` field and `pages` field.
     * 
     */
    private final String overview;
    /**
     * The top level pages for the documentation set.
     * 
     */
    private final List<PageResponse> pages;
    /**
     * A list of documentation rules that apply to individual API elements. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<DocumentationRuleResponse> rules;
    /**
     * Specifies the service root url if the default one (the service name from the yaml file) is not suitable. This can be seen in any fully specified service urls as well as sections that show a base that other urls are relative to.
     * 
     */
    private final String serviceRootUrl;
    /**
     * A short description of what the service does. The summary must be plain text. It becomes the overview of the service displayed in Google Cloud Console. NOTE: This field is equivalent to the standard field `description`.
     * 
     */
    private final String summary;

    @OutputCustomType.Constructor({"documentationRootUrl","overview","pages","rules","serviceRootUrl","summary"})
    private DocumentationResponse(
        String documentationRootUrl,
        String overview,
        List<PageResponse> pages,
        List<DocumentationRuleResponse> rules,
        String serviceRootUrl,
        String summary) {
        this.documentationRootUrl = Objects.requireNonNull(documentationRootUrl);
        this.overview = Objects.requireNonNull(overview);
        this.pages = Objects.requireNonNull(pages);
        this.rules = Objects.requireNonNull(rules);
        this.serviceRootUrl = Objects.requireNonNull(serviceRootUrl);
        this.summary = Objects.requireNonNull(summary);
    }

    /**
     * The URL to the root of documentation.
     * 
     */
    public String getDocumentationRootUrl() {
        return this.documentationRootUrl;
    }
    /**
     * Declares a single overview page. For example: documentation: summary: ... overview: (== include overview.md ==) This is a shortcut for the following declaration (using pages style): documentation: summary: ... pages: - name: Overview content: (== include overview.md ==) Note: you cannot specify both `overview` field and `pages` field.
     * 
     */
    public String getOverview() {
        return this.overview;
    }
    /**
     * The top level pages for the documentation set.
     * 
     */
    public List<PageResponse> getPages() {
        return this.pages;
    }
    /**
     * A list of documentation rules that apply to individual API elements. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    public List<DocumentationRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * Specifies the service root url if the default one (the service name from the yaml file) is not suitable. This can be seen in any fully specified service urls as well as sections that show a base that other urls are relative to.
     * 
     */
    public String getServiceRootUrl() {
        return this.serviceRootUrl;
    }
    /**
     * A short description of what the service does. The summary must be plain text. It becomes the overview of the service displayed in Google Cloud Console. NOTE: This field is equivalent to the standard field `description`.
     * 
     */
    public String getSummary() {
        return this.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentationRootUrl;
        private String overview;
        private List<PageResponse> pages;
        private List<DocumentationRuleResponse> rules;
        private String serviceRootUrl;
        private String summary;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentationRootUrl = defaults.documentationRootUrl;
    	      this.overview = defaults.overview;
    	      this.pages = defaults.pages;
    	      this.rules = defaults.rules;
    	      this.serviceRootUrl = defaults.serviceRootUrl;
    	      this.summary = defaults.summary;
        }

        public Builder setDocumentationRootUrl(String documentationRootUrl) {
            this.documentationRootUrl = Objects.requireNonNull(documentationRootUrl);
            return this;
        }

        public Builder setOverview(String overview) {
            this.overview = Objects.requireNonNull(overview);
            return this;
        }

        public Builder setPages(List<PageResponse> pages) {
            this.pages = Objects.requireNonNull(pages);
            return this;
        }

        public Builder setRules(List<DocumentationRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setServiceRootUrl(String serviceRootUrl) {
            this.serviceRootUrl = Objects.requireNonNull(serviceRootUrl);
            return this;
        }

        public Builder setSummary(String summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        public DocumentationResponse build() {
            return new DocumentationResponse(documentationRootUrl, overview, pages, rules, serviceRootUrl, summary);
        }
    }
}
