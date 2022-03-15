// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a documentation page. A page can contain subpages to represent nested documentation set structure.
 * 
 */
public final class PageResponse extends io.pulumi.resources.InvokeArgs {

    public static final PageResponse Empty = new PageResponse();

    /**
     * The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    @Import(name="content", required=true)
      private final String content;

    public String getContent() {
        return this.content;
    }

    /**
     * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    @Import(name="subpages", required=true)
      private final List<PageResponse> subpages;

    public List<PageResponse> getSubpages() {
        return this.subpages;
    }

    public PageResponse(
        String content,
        String name,
        List<PageResponse> subpages) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.subpages = Objects.requireNonNull(subpages, "expected parameter 'subpages' to be non-null");
    }

    private PageResponse() {
        this.content = null;
        this.name = null;
        this.subpages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String name;
        private List<PageResponse> subpages;

        public Builder() {
    	      // Empty
        }

        public Builder(PageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.name = defaults.name;
    	      this.subpages = defaults.subpages;
        }

        public Builder content(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder subpages(List<PageResponse> subpages) {
            this.subpages = Objects.requireNonNull(subpages);
            return this;
        }
        public PageResponse build() {
            return new PageResponse(content, name, subpages);
        }
    }
}
