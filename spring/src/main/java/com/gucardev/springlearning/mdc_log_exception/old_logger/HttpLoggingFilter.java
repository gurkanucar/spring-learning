package com.gucardev.springlearning.mdc_log_exception.old_logger;

//
//@Order(2)
//@Slf4j
//@Component
//public class HttpLoggingFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        RepeatableContentCachingRequestWrapper requestWrapper = new RepeatableContentCachingRequestWrapper(request);
//        ContentCachingResponseWrapper responseWrapper = new ContentCachingResponseWrapper(response);
//
//        if (Stream.of("/api","/serviceWorker","h2-console").anyMatch(x->request.getServletPath().contains(x)) ) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//        // Get request ID from X-trace-id header or generate a new one
//        String requestId = requestWrapper.getHeader("X-Trace-Id");
//        logRequest(requestWrapper, requestId);
//        filterChain.doFilter(requestWrapper, responseWrapper);
//        logResponse(responseWrapper, request, requestId);
//    }
//
//
//    private void logRequest(RepeatableContentCachingRequestWrapper requestWrapper, String requestId) throws IOException {
//        StringBuilder requestLog = new StringBuilder();
//        String body = requestWrapper.readInputAndDuplicate().trim().replaceAll("[\n\r]", "");
//
//        // Logging method, endpoint, and parameters
//        requestLog.append("Trace ID: ").append(requestId).append(", ");
//        requestLog.append("Method: ").append(requestWrapper.getMethod()).append(", ");
//        requestLog.append("Endpoint: ").append(requestWrapper.getRequestURI());
//        if (requestWrapper.getQueryString() != null) {
//            requestLog.append("?").append(requestWrapper.getQueryString());
//        }
//        // Logging request body
//        if (!body.isEmpty()) {
//            requestLog.append(", Body: ").append(body);
//        }
//        // Logging headers
//        requestLog.append(", Headers: {");
//        Enumeration<String> headerNames = requestWrapper.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            String headerName = headerNames.nextElement();
//            String headerValue = requestWrapper.getHeader(headerName);
//            requestLog.append(headerName).append(": ").append(headerValue);
//            if (headerNames.hasMoreElements()) {
//                requestLog.append(", ");
//            }
//        }
//        requestLog.append("}");
//
//        log.info("Request: {}", requestLog);
//    }
//
//    private void logResponse(ContentCachingResponseWrapper responseWrapper, HttpServletRequest request, String requestId) throws IOException {
//        String responseBody = new String(responseWrapper.getContentAsByteArray()).replaceAll("[\n\r]", "");
//        StringBuilder responseLog = new StringBuilder();
//        // Logging method, endpoint, and parameters
//        responseLog.append("Trace ID: ").append(requestId).append(", ");
//        responseLog.append("Method: ").append(request.getMethod()).append(", ");
//        responseLog.append("Endpoint: ").append(request.getRequestURI());
//        if (request.getQueryString() != null) {
//            responseLog.append("?").append(request.getQueryString());
//        }
//        // Logging response body
//        if (StringUtils.isNotBlank(responseBody)) {
//            responseLog.append(", Body: ").append(responseBody);
//            log.info("Response: {}", responseLog);
//        }
//
//        responseWrapper.copyBodyToResponse();
//    }
//}
